package org.javajunior.quest;


import org.javajunior.quest.dialog.State;
import org.javajunior.quest.dialog.start.HelloDialog;

public class Game {
    public static void main(String[] args) {
        State state = new HelloDialog();
        State previousState = null;
        while (true) {
            state = state.onEnter(previousState);
            if (state == null) {
                break;
            }
            System.out.println("Сделай ход:");
            String[] moves = state.getPossibleMoves();
            int moveNumber = 0;
            while ((moves.length > 0)
                    && ((moveNumber <= 0) || (moveNumber > moves.length))) {
                for (int i = 0; i < moves.length; i++) {
                    System.out.println("" + (i + 1) + " - " + moves[i]);
                }
                moveNumber = Utils.readInt();
            }

            previousState = state;

            if (moveNumber > 0) {
                state = state.getTransitionTable().get(moveNumber - 1);
            } else {
                break;
            }

        }

        System.out.println("Конец игры!");
    }
}
