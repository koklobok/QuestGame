package org.javajunior.quest.dialog.start;

import org.javajunior.quest.character.Player;
import org.javajunior.quest.dialog.State;
import org.javajunior.quest.util.Input;

import java.util.ArrayList;
import java.util.List;

public class StartDialog implements State {
    private Player player;

    @Override
    public String[] getPossibleMoves() {
        return new String[]{"в бой, " + player.getName()};
    }

    @Override
    public List<State> getTransitionTable() {
        List<State> result = new ArrayList<>();
        result.add(new SelectPathDialog());
        return result;
    }

    @Override
    public State onEnter(State previousState) {
        player = new Player();
        System.out.println("Ты отважный воин! Введи имя героя");
        player.setName(Input.readString());

        return this;
    }
}
