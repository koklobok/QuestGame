package org.javajunior.quest.dialog.start;

import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.dialog.State;

import java.util.ArrayList;
import java.util.List;

public class GoToForest implements State {
    @Override
    public String[] getPossibleMoves() {
        return new String[]{"Начать бороться", "Вернутся к выбору пути \n"};
    }

    @Override
    public List<State> getTransitionTable() {
        List<State> result = new ArrayList<>();
        result.add(new TaskOne());
        result.add(new SelectPathDialog());
        return result;
    }

    @Override
    public State onEnter(State previousState, PlayerAware playerAware) {
        System.out.println("Странник твоя смелость не знает предела, ты попал в дремучий, темный лес.\n" +
                "Для того что бы пройти через него тебе придется решить несколько задач.\n");
        return this;
    }
}
