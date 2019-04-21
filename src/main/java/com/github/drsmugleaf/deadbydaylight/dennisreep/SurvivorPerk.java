package com.github.drsmugleaf.deadbydaylight.dennisreep;

import com.github.drsmugleaf.deadbydaylight.ICharacter;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Created by DrSmugleaf on 06/11/2018
 */
public class SurvivorPerk extends Perk {

    @Nonnull
    @SerializedName("Survivor")
    public final String SURVIVOR_NAME;

    SurvivorPerk(@Nonnull String name, @Nonnull Tiers tier, double rating, long ratings, @Nonnull String survivorName) {
        super(name, tier, rating, ratings);
        SURVIVOR_NAME = survivorName;
    }

    @Nonnull
    public static SurvivorPerk from(@Nonnull JsonElement json) {
        JsonObject object = json.getAsJsonObject();
        return API.GSON.fromJson(object, SurvivorPerk.class);
    }

    @Nullable
    @Override
    public ICharacter getCharacter() {
        return null;
    }

}
