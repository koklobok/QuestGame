package org.javajunior.quest.dialog.end;

import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.dialog.State;

public class EndGameFailed implements State {

    @Override
    public State onEnter(State previousState, PlayerAware playerAware) {
        System.out.println("Поджав хвост ты ушел с поля боя, дракон в то время съел всю деревню.");
        return null;
    }
}
