package com.github.drsmugleaf.commands.api;

import com.github.drsmugleaf.BanterBot4J;
import com.github.drsmugleaf.commands.api.converter.Result;
import com.github.drsmugleaf.commands.api.converter.TypeConverters;
import com.github.drsmugleaf.commands.api.registry.CommandField;
import com.github.drsmugleaf.commands.api.registry.CommandSearchResult;
import com.github.drsmugleaf.commands.api.registry.Entry;
import com.github.drsmugleaf.commands.api.tags.Tag;
import discord4j.core.object.entity.Member;
import discord4j.core.object.entity.Message;
import discord4j.core.object.entity.User;
import discord4j.core.spec.MessageCreateSpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.lang.reflect.Field;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

/**
 * Created by DrSmugleaf on 09/06/2018
 */
public class Command implements ICommand {

    @Nonnull
    protected static final Logger LOGGER = LoggerFactory.getLogger(Command.class);

    @Nonnull
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.RFC_1123_DATE_TIME.withZone(ZoneOffset.UTC);

    public CommandReceivedEvent EVENT;
    public Arguments ARGUMENTS;

    @Nullable
    public User SELF_USER;

    @Nonnull
    public Member SELF_MEMBER;

    protected Command() {}

    protected static void run(@Nonnull CommandSearchResult commandSearch, @Nonnull CommandReceivedEvent event) {
        Entry entry = commandSearch.getEntry();
        CommandInfo annotation = entry.getCommandInfo();

        if (annotation != null) {
            for (Tag tags : annotation.tags()) {
                tags.execute(event);
            }
        }

        Command command = entry.newInstance();
        Arguments arguments = new Arguments(commandSearch, event);
        Entry.setEvent(command, event);
        Entry.setArgs(command, arguments);
        Entry.setSelfUser(command, event);
        Entry.setSelfMember(command, event);

        if (command.setArguments(entry)) {
            command.run();
        }
    }

    public static boolean isOwner(@Nullable User user) {
        if (user == null) {
            return false;
        }

        return BanterBot4J.OWNERS.contains(user.getId().asLong());
    }

    @Nonnull
    public static String getDate() {
        return DATE_FORMAT.format(Instant.now());
    }

    @Nonnull
    public CommandReceivedEvent getEvent() {
        return EVENT;
    }

    @Nonnull
    public Arguments getArguments() {
        return ARGUMENTS;
    }

    private boolean setArguments(@Nonnull Entry entry) {
        for (CommandField commandField : entry.getCommandFields()) {
            Field field = commandField.getField();
            field.setAccessible(true);

            Object def;
            try {
                def = field.get(this);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Error getting command argument " + field, e);
            }

            Result result = ARGUMENTS.getArg(commandField, def);
            if (!result.isValid()) {
                reply(result.getErrorResponse()).subscribe();
                return false;
            }

            try {
                field.set(this, result.getElement());
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Error setting command argument " + field, e);
            }
        }

        return true;
    }

    @Nonnull
    public Mono<Message> reply(@Nonnull Consumer<MessageCreateSpec> spec) {
        return EVENT.reply(spec);
    }

    @Nonnull
    public Mono<Message> reply(@Nonnull String content) {
        return EVENT.reply(content);
    }

    @Override
    public void run() {}

    public void registerConverters(@Nonnull TypeConverters converter) {}

}
