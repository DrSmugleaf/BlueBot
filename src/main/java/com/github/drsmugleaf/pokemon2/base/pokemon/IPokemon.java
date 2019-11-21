package com.github.drsmugleaf.pokemon2.base.pokemon;

import com.github.drsmugleaf.Nullable;
import com.github.drsmugleaf.pokemon2.base.pokemon.species.ISpecies;
import com.github.drsmugleaf.pokemon2.base.pokemon.stat.IStatHandler;
import com.github.drsmugleaf.pokemon2.base.pokemon.type.IType;
import com.github.drsmugleaf.pokemon2.generations.ii.item.IItem;
import com.github.drsmugleaf.pokemon2.generations.ii.pokemon.gender.IGender;
import com.google.common.collect.ImmutableSet;

import java.util.Collection;

/**
 * Created by DrSmugleaf on 13/11/2019
 */
public interface IPokemon<T extends ISpecies> extends ISpecies {

    T getSpecies();
    @Nullable String getNickname();
    String getDisplayName();
    ImmutableSet<IType> getTypes();
    void setTypes(Collection<IType> types);
    @Nullable IItem getItem();
    IGender getGender();
    int getLevel();
    IStatHandler<IPokemon<T>> getStats();
    int getMaxHP();
    int getHP();
    double getWeight(); // Kilograms
    boolean isAlive();
    void faint();
    void damage(int amount);
    void damage(double percentage);
    void heal(int amount);

}
