package com.github.drsmugleaf.commands;

import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * Created by DrSmugleaf on 16/01/2018.
 */
abstract class ICommand {

    abstract void run(@Nonnull MessageReceivedEvent event, @Nonnull List<String> args);

}
