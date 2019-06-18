package com.github.drsmugleaf.commands.api.registry;

import com.github.drsmugleaf.BanterBot4J;
import com.github.drsmugleaf.commands.api.Arguments;
import com.github.drsmugleaf.commands.api.Command;
import com.github.drsmugleaf.commands.api.converter.TypeConverters;
import com.google.common.collect.ImmutableList;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by DrSmugleaf on 21/06/2018
 */
public class Registry {

    @Nonnull
    private final TypeConverters CONVERTERS;

    @Nonnull
    private final ImmutableList<Entry> ENTRIES;

    public Registry(@Nonnull List<Class<Command>> commands) {
        CONVERTERS = new TypeConverters();

        List<Entry> entries = new ArrayList<>();
        for (Class<Command> command : commands) {
            Entry entry = new Entry(command);
            entries.add(entry);
        }

        ENTRIES = ImmutableList.copyOf(entries);
        CONVERTERS.registerConverters(entries);

        List<CommandSearchResult> duplicates = findDuplicates();
        if (!duplicates.isEmpty()) {
            String duplicatesString = formatDuplicates(duplicates);
            throw new DuplicateCommandNameException(duplicatesString);
        }
    }

    @Nonnull
    public TypeConverters getConverters() {
        return CONVERTERS;
    }

    @Nonnull
    private List<CommandSearchResult> findDuplicates() {
        Set<String> uniqueAliases = new HashSet<>();
        List<CommandSearchResult> duplicateAliases = new ArrayList<>();

        for (Entry entry : ENTRIES) {
            for (String alias : entry.getAllAliases()) {
                if (!uniqueAliases.add(alias)) {
                    CommandSearchResult result = new CommandSearchResult(entry, alias);
                    duplicateAliases.add(result);
                }
            }
        }

        return duplicateAliases;
    }

    @Nonnull
    private String formatDuplicates(@Nonnull List<CommandSearchResult> duplicates) {
        if (duplicates.isEmpty()) {
            return "No duplicate command names found";
        }

        StringBuilder builder = new StringBuilder("Duplicate command names found:");
        for (CommandSearchResult duplicate : duplicates) {
            builder
                    .append("\n")
                    .append(duplicate.getEntry())
                    .append(": ")
                    .append(duplicate.getMatchedName());
        }

        return builder.toString();
    }

    @Nullable
    public CommandSearchResult findCommand(@Nonnull String message) {
        message = message.substring(BanterBot4J.BOT_PREFIX.length()).toLowerCase();
        List<CommandSearchResult> matches = new ArrayList<>();

        List<String> argsList = Arguments.parseArgs(message);
        while (argsList.size() > 0) {
            String args = String.join(" ", argsList);

            for (Entry entry : ENTRIES) {
                for (String alias : entry.getAllAliases()) {
                    if (alias.equalsIgnoreCase(args)) {
                        CommandSearchResult result = new CommandSearchResult(entry, alias);
                        matches.add(result);
                    }
                }
            }

            if (!matches.isEmpty()) {
                if (matches.size() > 1) {
                    BanterBot4J.warn("More than 1 match found for " + message + ". Matches: " + matches);
                }

                return matches.get(0);
            }

            argsList.remove(argsList.size() - 1);
        }

        return null;
    }

}
