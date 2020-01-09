package com.github.drsmugleaf.tak.player;

import com.github.drsmugleaf.tak.game.Game;
import com.github.drsmugleaf.tak.pieces.IColor;

/**
 * Created by DrSmugleaf on 09/01/2020
 */
public interface IPlayerInformation {

    String getName();
    Game getGame();
    IColor getColor();

}
