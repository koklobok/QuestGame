package org.javajunior.quest.dialog;

import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.util.Input;

import java.util.Collections;
import java.util.List;

public abstract class AbstractState implements State{
    private static final String[] EMPTY_MOVES = new String[0];

    protected String[] getPossibleMoves() {
        return EMPTY_MOVES;
    }

    protected List<State> getTransitionTable() {
        return Collections.emptyList();
    }

    protected abstract void printHello();

    @Override
    public State onEnter(State previousState, PlayerAware playerAware) {
        printHello();
        System.out.println("Сделай ход:");
        String moves[] = getPossibleMoves();
        int moveNumber = 0;
        while ((moveNumber <= 0) || (moveNumber > moves.length)) {
            for (int i = 0; i < moves.length; i++) {
                System.out.println("" + (i + 1) + " - " + moves[i]);
            }
            moveNumber = Input.readInt();
        }
        return getTransitionTable().get(moveNumber - 1);
    }
}
