package org.javajunior.quest.dialog.start;

import org.javajunior.quest.character.Player;
import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.dialog.SelectOptionDialogLink;
import org.javajunior.quest.dialog.DialogLink;
import org.javajunior.quest.dialog.path.SelectPathDialog;
import org.javajunior.quest.util.Input;

public class StartDialog extends SelectOptionDialogLink {

    @Override
    protected void printHello() {
        System.out.println("Ты отважный воин! Введи имя героя");
    }

    @Override
    public DialogLink nextDialog(DialogLink previousState, PlayerAware playerAware) {
        printHello();
        Player player = new Player();

        player.setName(Input.readString());
        player.selectRace();
        playerAware.setPlayer(player);

        return new SelectPathDialog();
    }

    @Override
    public String getDescription() {
        return "Пойти навалять";
    }
}
