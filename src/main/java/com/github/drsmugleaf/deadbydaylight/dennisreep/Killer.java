package com.github.drsmugleaf.deadbydaylight.dennisreep;

import com.github.drsmugleaf.BanterBot4J;
import com.github.drsmugleaf.deadbydaylight.ICharacter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by DrSmugleaf on 06/11/2018
 */
public class Killer implements ICharacter {

    @Nonnull
    @SerializedName("KillerName")
    public final String NAME;

    @Nonnull
    @SerializedName("Image")
    public final String IMAGE_URL;

    @Nonnull
    @SerializedName("Tier")
    public final Tiers TIER;

    @SerializedName("Rating")
    public final double RATING;

    @SerializedName("Ratings")
    public final long RATINGS;

    Killer(@Nonnull String name, @Nonnull String imageUrl, @Nonnull Tiers tier, double rating, long ratings) {
        NAME = name;
        IMAGE_URL = imageUrl;
        TIER = tier;
        RATING = rating;
        RATINGS = ratings;
    }

    @Nonnull
    public static Killer from(@Nonnull JsonElement json) {
        return API.GSON.fromJson(json, Killer.class);
    }

    @Nonnull
    @Override
    public String getName() {
        return NAME;
    }

    @Nonnull
    @Override
    public InputStream getImage() {
        try {
            return new URL(IMAGE_URL).openStream();
        } catch (IOException e) {
            BanterBot4J.warn("Error getting image from url " + IMAGE_URL);
            return API.getDBDLogo();
        }
    }

    @Nullable
    @Override
    public Double getRating() {
        return RATING;
    }

}
