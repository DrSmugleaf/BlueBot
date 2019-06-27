package com.github.drsmugleaf.pokemon.events;

import com.github.drsmugleaf.pokemon.moves.Move;
import com.github.drsmugleaf.pokemon.pokemon.Pokemon;
import org.jetbrains.annotations.Contract;

/**
 * Created by DrSmugleaf on 19/07/2017.
 */
public class TrainerChooseTargetEvent extends TrainerChooseMoveEvent {

    public final Pokemon TARGET;

    public TrainerChooseTargetEvent(Pokemon pokemon, Move move, Pokemon target) {
        super(pokemon, move);
        TARGET = target;
    }

    @Contract(pure = true)
    public Pokemon getTarget() {
        return TARGET;
    }

}
