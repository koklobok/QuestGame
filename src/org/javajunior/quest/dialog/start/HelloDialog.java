package org.javajunior.quest.dialog.start;

import org.javajunior.quest.dialog.EndGameFailed;
import org.javajunior.quest.dialog.State;

import java.util.ArrayList;
import java.util.List;

public class HelloDialog implements State {

    @Override
    public String[] getPossibleMoves() {
        return new String[]{"Пойти навалять", "Уйти с позором"};
    }

    @Override
    public List<State> getTransitionTable() {
        List<State> flow = new ArrayList<>();
        flow.add(new StartDialog());
        flow.add(new EndGameFailed());
        return flow;
    }

    @Override
    public State onEnter(State previousState) {
        System.out.println("Привет игрок, выбери ход");
        return this;
    }
}
