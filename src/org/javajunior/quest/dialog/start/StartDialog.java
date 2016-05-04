package org.javajunior.quest.dialog.start;

import org.javajunior.quest.character.Player;
import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.dialog.AbstractState;
import org.javajunior.quest.dialog.State;
import org.javajunior.quest.dialog.path.SelectPathDialog;
import org.javajunior.quest.util.Input;

public class StartDialog extends AbstractState {
    private Player player;

    @Override
    protected void printHello() {
        System.out.println("Ты отважный воин! Введи имя героя");
    }

    @Override
    public State onEnter(State previousState, PlayerAware playerAware) {
        printHello();
        player = new Player();

        player.setName(Input.readString());
        player.selectRace();
        playerAware.setPlayer(player);

        return new SelectPathDialog();
    }

}
