package com.github.drsmugleaf.tak.bot.random;

import com.github.drsmugleaf.Nullable;
import com.github.drsmugleaf.tak.board.action.IAction;
import com.github.drsmugleaf.tak.bot.Bot;
import com.github.drsmugleaf.tak.game.IGame;
import com.github.drsmugleaf.tak.pieces.IColor;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by DrSmugleaf on 16/03/2019
 */
public abstract class RandomBot extends Bot {

    protected RandomBot(String name, IGame game, IColor color) {
        super(name, game, color, false);
    }

    @Nullable
    @Override
    public IAction getNextAction() {
        List<IAction> availableActions = getAvailableActions();
        if (availableActions.isEmpty()) {
            return null;
        }

        int random = ThreadLocalRandom.current().nextInt(availableActions.size());
        return availableActions.get(random);
    }

}
