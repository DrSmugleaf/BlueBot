package com.github.drsmugleaf.pokemon2.generations.i.generation;

import com.github.drsmugleaf.pokemon2.base.game.GameRegistry;
import com.github.drsmugleaf.pokemon2.base.generation.BaseGeneration;
import com.github.drsmugleaf.pokemon2.base.species.Pokedex;
import com.github.drsmugleaf.pokemon2.base.species.stat.StatRegistry;
import com.github.drsmugleaf.pokemon2.generations.i.game.GamesI;
import com.github.drsmugleaf.pokemon2.generations.i.species.PokedexI;
import com.github.drsmugleaf.pokemon2.generations.i.species.SpeciesI;
import com.github.drsmugleaf.pokemon2.generations.i.species.stat.StatsI;
import org.jetbrains.annotations.Contract;

/**
 * Created by DrSmugleaf on 01/07/2019
 */
public class GenerationI extends BaseGeneration {

    private static final GenerationI INSTANCE = new GenerationI();

    private final GameRegistry GAMES = new GameRegistry(GamesI.values());
    private final Pokedex<SpeciesI> POKEDEX = new PokedexI<>(this, SpeciesI::new);
    private final StatRegistry STATS = new StatRegistry(StatsI.values());

    private GenerationI() {
        super();
    }

    @Contract(pure = true)
    public static GenerationI get() {
        return INSTANCE;
    }

    @Override
    public int getID() {
        return 1;
    }

    @Override
    public Pokedex<SpeciesI> getPokedex() {
        return POKEDEX;
    }

    @Override
    public StatRegistry getStats() {
        return STATS;
    }

    @Override
    public String getAbbreviation() {
        return "RB";
    }

    @Override
    public GameRegistry getGames() {
        return GAMES;
    }

    @Override
    public int getNewPokemons() {
        return 151;
    }

    @Override
    public String getName() {
        return "Generation I";
    }

}