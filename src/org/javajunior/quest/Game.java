package org.javajunior.quest;


import org.javajunior.quest.character.Player;
import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.dialog.DialogLink;
import org.javajunior.quest.dialog.start.HelloDialog;

public class Game  implements PlayerAware{
    private Player player;

    public static void main(String[] args)  {
        new Game().run();
    }

    public void run() {
        DialogLink state = new HelloDialog();
        DialogLink previousState = null;
        while (true) {

            state = state.nextDialog(previousState, this);
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
