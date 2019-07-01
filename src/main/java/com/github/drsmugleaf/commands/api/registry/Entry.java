package com.github.drsmugleaf.commands.api.registry;

import com.github.drsmugleaf.Nullable;
import com.github.drsmugleaf.commands.api.Arguments;
import com.github.drsmugleaf.commands.api.Command;
import com.github.drsmugleaf.commands.api.CommandInfo;
import com.github.drsmugleaf.commands.api.CommandReceivedEvent;
import com.google.common.collect.ImmutableList;
import discord4j.core.object.entity.Member;
import discord4j.core.object.entity.User;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DrSmugleaf on 13/04/2019
 */
public class Entry {

    private final Class<? extends Command> COMMAND;

    @Nullable
    private final CommandInfo COMMAND_INFO;

    private final ImmutableList<CommandField> COMMAND_FIELDS;

    protected Entry(Class<? extends Command> command) {
        COMMAND = command;
        COMMAND_INFO = command.getDeclaredAnnotation(CommandInfo.class);
        COMMAND_FIELDS = ImmutableList.copyOf(CommandField.from(command));
    }

    public static void setEvent(Command command, CommandReceivedEvent event) {
        try {
            Command.class.getDeclaredField("EVENT").set(command, event);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new IllegalStateException("Error setting event field for command " + command, e);
        }
    }

    public static void setArgs(Command command, Arguments args) {
        try {
            Command.class.getDeclaredField("ARGUMENTS").set(command, args);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new IllegalStateException("Error setting args field for command " + command, e);
        }
    }

    public static void setSelfUser(Command command, CommandReceivedEvent event) {
        User selfUser = event
                .getClient()
                .getSelf()
                .blockOptional()
                .orElseThrow(() -> new IllegalStateException("Unable to get self user"));

        try {
            Command.class.getDeclaredField("SELF_USER").set(command, selfUser);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new IllegalStateException("Error setting self user field for command " + command, e);
        }
    }

    public static void setSelfMember(Command command, CommandReceivedEvent event) {
        Member selfMember = event
                .getClient()
                .getSelf()
                .zipWith(Mono.justOrEmpty(event.getGuildId()))
                .flatMap(tuple -> tuple.getT1().asMember(tuple.getT2()))
                .blockOptional()
                .orElse(null);

        try {
            Command.class.getDeclaredField("SELF_MEMBER").set(command, selfMember);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new IllegalStateException("Error setting self member field for command " + command, e);
        }
    }

    public Class<? extends Command> getCommand() {
        return COMMAND;
    }

    @Nullable
    public CommandInfo getCommandInfo() {
        return COMMAND_INFO;
    }

    public String getName() {
        String commandName;
        CommandInfo annotation = getCommandInfo();

        if (annotation == null || annotation.name().isEmpty()) {
            commandName = getCommand().getSimpleName();
        } else {
            commandName = annotation.name();
        }

        return commandName.toLowerCase();
    }

    public List<String> getAliases() {
        CommandInfo annotation = getCommandInfo();

        List<String> commandAliases = new ArrayList<>();
        if (annotation == null || annotation.aliases().length == 0) {
            return commandAliases;
        }

        for (String alias : annotation.aliases()) {
            commandAliases.add(alias.toLowerCase());
        }

        return commandAliases;
    }

    public List<String> getAllAliases() {
        List<String> aliases = getAliases();
        aliases.add(getName());
        return aliases;
    }

    public ImmutableList<CommandField> getCommandFields() {
        return COMMAND_FIELDS;
    }

    public Command newInstance() {
        try {
            return COMMAND.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalStateException("Error creating instance of command " + getName(), e);
        }
    }

}