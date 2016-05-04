package org.javajunior.quest.dialog.end;

import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.dialog.DialogLink;

public class EndGameDragonWins implements DialogLink {

    @Override
    public DialogLink nextDialog(DialogLink previousState, PlayerAware playerAware) {
        System.out.println("Дракон побеждает, пожалеем бедную деревню. ");
        return null;
    }

    @Override
    public String getDescription() {
        return "Не хватает смелости";
    }
}
