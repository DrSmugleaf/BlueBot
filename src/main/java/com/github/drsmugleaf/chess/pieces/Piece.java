package com.github.drsmugleaf.chess.pieces;

import org.jetbrains.annotations.NotNull;

/**
 * Created by DrSmugleaf on 08/01/2019
 */
public class Piece {

    @NotNull
    private final Color COLOR;

    @NotNull
    private final Type TYPE;

    public Piece(@NotNull Color color, @NotNull Type type) {
        COLOR = color;
        TYPE = type;
    }

    @NotNull
    public Color getColor() {
        return COLOR;
    }

    @NotNull
    public Type getType() {
        return TYPE;
    }

    @NotNull
    @Override
    public String toString() {
        return TYPE.toString();
    }

}
