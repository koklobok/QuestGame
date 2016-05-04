package org.javajunior.quest.dialog.end;

import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.dialog.State;

public class EndGameDragonWins implements State {

    @Override
    public State onEnter(State previousState, PlayerAware playerAware) {
        System.out.println("Дракон побеждает, люди тебя забудут. ");
        return null;
    }
}
