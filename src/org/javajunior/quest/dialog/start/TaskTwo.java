package org.javajunior.quest.dialog.start;

import org.javajunior.quest.dialog.EndGameFailed;
import org.javajunior.quest.dialog.State;
import org.javajunior.quest.util.Input;

import java.util.ArrayList;
import java.util.List;

public class TaskTwo implements State {
    @Override
    public String[] getPossibleMoves() {
        return new String[]{"Сразится с драконом ", "Не хватает смелости \n"};
    }

    @Override
    public List<State> getTransitionTable() {
        List<State> result = new ArrayList<>();
        result.add(new BattleWithDragon());
        result.add(new EndGameFailed());
        return result;
    }

    @Override
    public State onEnter(State previousState) throws InterruptedException {
        LogicTaskTwo logicTaskTwo = new LogicTaskTwo();
        logicTaskTwo.setAnswer(Input.readInt());
        System.out.println("Твой ответ :" + logicTaskTwo.getAnswer());
        Thread.sleep(5000);
        if (logicTaskTwo.getAnswer() != 320) {
            System.out.println("Твой ответ не верен попробуй еще раз\n");
            Thread.sleep(1000);
            return previousState;
        }
        System.out.println("Ты ответил правильно, теперь ты сможешь сразится с драконом\n");
        Thread.sleep(2000);
        return this;
    }
}
