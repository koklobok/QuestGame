package org.javajunior.quest.dialog;

import org.javajunior.quest.character.PlayerAware;

import java.util.List;

public class EndGamePlayerWins implements State {
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
        System.out.println("Ты победил дракона! Люди в твою честь назвали улицу.");
        return null;
    }
}
