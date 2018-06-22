package com.github.drsmugleaf.commands.api;

import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.internal.json.objects.EmbedObject;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;
import sx.blah.discord.handle.obj.*;
import sx.blah.discord.util.RateLimitException;
import sx.blah.discord.util.RequestBuffer;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Comparator;
import java.util.List;

/**
 * Created by DrSmugleaf on 29/05/2018.
 */
public class CommandReceivedEvent extends MessageReceivedEvent {

    @Nonnull
    protected IDiscordClient client;

    protected CommandReceivedEvent(@Nonnull IMessage message) {
        super(message);
        client = message.getClient();
    }

    protected CommandReceivedEvent(@Nonnull MessageReceivedEvent event) {
        this(event.getMessage());
    }

    @Nonnull
    @Override
    public IDiscordClient getClient() {
        return client;
    }

    @Nullable
    public static IRole getHighestRole(@Nonnull List<IRole> roles) {
        if (roles.isEmpty()) {
            return null;
        }

        roles.sort(Comparator.comparingInt(IRole::getPosition));
        return roles.get(roles.size() - 1);
    }

    @Nullable
    public static IRole getHighestRole(@Nonnull IUser user, @Nonnull IGuild guild) {
        List<IRole> roles = user.getRolesForGuild(guild);
        return getHighestRole(roles);
    }

    @Nonnull
    public static IMessage sendMessage(@Nonnull IChannel channel, @Nonnull String content) {
        return RequestBuffer.request(() -> {
            try {
                return channel.sendMessage(content);
            } catch (RateLimitException e) {
                Command.LOGGER.error("Message could not be sent", e);
                throw e;
            }
        }).get();
    }

    @Nonnull
    public static IMessage sendMessage(@Nonnull IChannel channel, @Nonnull EmbedObject embed) {
        return RequestBuffer.request(() -> {
            try {
                return channel.sendMessage(embed);
            } catch (RateLimitException e) {
                Command.LOGGER.error("Embed could not be sent", e);
                throw e;
            }
        }).get();
    }

    @Nonnull
    public static IMessage sendMessage(@Nonnull IChannel channel, @Nonnull String content, @Nonnull EmbedObject embed) {
        return RequestBuffer.request(() -> {
            try {
                return channel.sendMessage(content, embed);
            } catch (RateLimitException e) {
                Command.LOGGER.error("Embed could not be sent", e);
                throw e;
            }
        }).get();
    }

    @Nullable
    public IRole getHighestAuthorRole() {
        IGuild guild = getGuild();
        if (guild == null) {
            return null;
        }

        List<IRole> roles = getAuthor().getRolesForGuild(guild);
        return getHighestRole(roles);
    }

    @Nullable
    public IMessage reply(@Nonnull String content) {
        return RequestBuffer.request(() -> {
            try {
                return getMessage().reply(content);
            } catch (RateLimitException e) {
                Command.LOGGER.error("Message could not be sent", e);
                throw e;
            }
        }).get();
    }

    @Nullable
    public IMessage reply(@Nonnull EmbedObject embed) {
        return RequestBuffer.request(() -> {
            try {
                return getMessage().reply(null, embed);
            } catch (RateLimitException e) {
                Command.LOGGER.error("Embed could not be sent", e);
                throw e;
            }
        }).get();
    }

    @Nullable
    public IMessage reply(@Nonnull String content, EmbedObject embed) {
        return RequestBuffer.request(() -> {
            try {
                return getMessage().reply(content, embed);
            } catch (RateLimitException e) {
                Command.LOGGER.error("Message with embed could not be sent", e);
                throw e;
            }
        }).get();
    }

}