package org.javajunior.quest;


import org.javajunior.quest.character.Player;
import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.dialog.State;
import org.javajunior.quest.dialog.start.HelloDialog;
import org.javajunior.quest.util.Input;

public class Game  implements PlayerAware{
    private Player player;

    public static void main(String[] args)  {
        new Game().run();
    }

    public void run() {
        State state = new HelloDialog();
        State previousState = null;
        while (true) {

            state = state.onEnter(previousState, this);
            if (state == null) {
                break;
            }

            previousState = state;

        }

        System.out.println("Конец игры!");
    }

    @Override
    public void setPlayer(Player newPlayer) {
        this.player = newPlayer;
    }

    @Override
    public Player getPlayer() {
        return player;
    }

}
