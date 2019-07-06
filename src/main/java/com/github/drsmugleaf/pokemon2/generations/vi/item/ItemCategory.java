package com.github.drsmugleaf.pokemon2.generations.vi.item;

import com.github.drsmugleaf.pokemon2.base.item.IItemCategory;
import org.jetbrains.annotations.Contract;

/**
 * Created by DrSmugleaf on 01/07/2019
 */
public enum ItemCategory implements IItemCategory {

    MEGA_STONE("Mega Stone"),
    PRIMAL_ORB("Primal Orb");

    private final String NAME;

    ItemCategory(String name) {
        NAME = name;
    }

    @Contract(pure = true)
    @Override
    public String getName() {
        return NAME;
    }

}