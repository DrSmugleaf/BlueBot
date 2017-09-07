package com.github.drsmugbrain.youtube;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;

import javax.annotation.Nonnull;

/**
 * Created by DrSmugleaf on 07/09/2017.
 */
public class SongStartEvent extends SongEvent {

    protected SongStartEvent(@Nonnull AudioPlayer player, @Nonnull Song song) {
        super(player, song);
    }

}
