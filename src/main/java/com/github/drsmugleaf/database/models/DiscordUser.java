package com.github.drsmugleaf.database.models;

import com.github.drsmugleaf.BanterBot4J;
import com.github.drsmugleaf.database.api.Model;
import com.github.drsmugleaf.database.api.annotations.Column;
import com.github.drsmugleaf.database.api.annotations.Table;
import discord4j.core.object.entity.User;
import discord4j.core.object.util.Snowflake;

/**
 * Created by DrSmugleaf on 14/05/2017.
 */
@Table(name = "users")
public class DiscordUser extends Model<DiscordUser> {

    @Column(name = "id")
    @Column.Id
    public Long id;

    public DiscordUser(Long id) {
        this.id = id;
    }

    private DiscordUser() {}

    public User user() {
        return BanterBot4J
                .CLIENT
                .getUserById(Snowflake.of(id))
                .blockOptional()
                .orElseThrow(() -> new IllegalStateException("No Discord user found with id " + id));
    }

}