package org.javajunior.quest.dialog;

import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.dialog.State;

import java.util.List;

public class EndGameDragonWins implements State {
    @Override
    public String[] getPossibleMoves() {
        return null;
    }

    @Override
    public List<State> getTransitionTable() {
        return null;
    }

    @Override
    public State onEnter(State previousState, PlayerAware playerAware) {
        System.out.println("Дракон побеждает, люди тебя забудут. ");
        return null;
    }
}
