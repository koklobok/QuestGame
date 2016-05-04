package org.javajunior.quest.dialog.end;

import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.dialog.DialogLink;

public class EndGameFailed implements DialogLink {

    @Override
    public DialogLink nextDialog(DialogLink previousState, PlayerAware playerAware) {
        System.out.println("Поджав хвост ты ушел с поля боя, дракон в то время съел всю деревню.");
        return null;
    }

    @Override
    public String getDescription() {
        return "Сдатья и уйти с позором";
    }
}
