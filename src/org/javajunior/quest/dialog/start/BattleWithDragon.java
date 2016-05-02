package org.javajunior.quest.dialog.start;

import org.javajunior.quest.dialog.State;

import java.util.List;

public class BattleWithDragon implements State {
    @Override
    public String[] getPossibleMoves() {
        return new String[0];
    }

    @Override
    public List<State> getTransitionTable() {
        return null;
    }

    @Override
    public State onEnter(State previousState) {
        return null;
    }
}
