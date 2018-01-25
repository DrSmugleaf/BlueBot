package com.github.drsmugleaf.pokemon.events;

import com.github.drsmugleaf.pokemon.pokemon.Pokemon;

import javax.annotation.Nonnull;

/**
 * Created by DrSmugleaf on 20/07/2017.
 */
public class PokemonDodgeEvent extends PokemonEvent {

    public PokemonDodgeEvent(@Nonnull Pokemon pokemon) {
        super(pokemon);
    }

}