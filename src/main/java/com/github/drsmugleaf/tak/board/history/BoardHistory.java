package com.github.drsmugleaf.tak.board.history;

import com.github.drsmugleaf.Nullable;
import com.github.drsmugleaf.tak.board.IBoard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by DrSmugleaf on 16/01/2020
 */
public class BoardHistory implements IBoardHistory {

    private int id;
    private final List<IBoardState> STATES;

    public BoardHistory(IBoard board) {
        id = 0;
        STATES = new ArrayList<>();
        addState(board);
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public void addState(IBoard board) {
        IBoardState state = new BoardState(id, getState(), board);
        STATES.add(state);
        id = STATES.size() - 1;
    }

    @Override
    public List<IBoardState> getStates() {
        return Collections.unmodifiableList(STATES);
    }

    @Override
    public IBoardState getState() {
        return STATES.get(getID());
    }

    @Nullable
    @Override
    public IBoardState getPrevious(IBoardState state) {
        int id = state.getID();
        if (id < 0) {
            return null;
        }

        return STATES.get(id);
    }

    @Nullable
    @Override
    public IBoardState getNext(IBoardState state) {
        int id = state.getID();
        if (id >= STATES.size()) {
            return null;
        }

        return STATES.get(id);
    }

}