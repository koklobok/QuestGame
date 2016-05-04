package org.javajunior.quest.dialog.end;

import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.dialog.State;

public class EndGamePlayerWins implements State {

    @Override
    public State onEnter(State previousState, PlayerAware playerAware) {
        System.out.println("Ты победил дракона! Люди в твою честь назвали улицу.");
        return null;
    }
}
