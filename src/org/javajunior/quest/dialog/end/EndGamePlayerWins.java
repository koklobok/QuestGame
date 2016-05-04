package org.javajunior.quest.dialog.end;

import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.dialog.DialogLink;

public class EndGamePlayerWins implements DialogLink {

    @Override
    public DialogLink nextDialog(DialogLink previousState, PlayerAware playerAware) {
        System.out.println("Ты победил дракона! Люди в твою честь назвали улицу.");
        return null;
    }

    @Override
    public String getDescription() {
        return "Победа игрока";
    }
}
