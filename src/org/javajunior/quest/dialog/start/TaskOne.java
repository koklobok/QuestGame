package org.javajunior.quest.dialog.start;

import org.javajunior.quest.dialog.EndGameFailed;
import org.javajunior.quest.dialog.State;
import org.javajunior.quest.util.Input;

import java.util.ArrayList;
import java.util.List;

public class TaskOne implements State{
    @Override
    public String[] getPossibleMoves() {
        return new String[]{"Решить еще одну задачу", "Сдатья и уйти с позором \n"};
    }

    @Override
    public List<State> getTransitionTable() {
        List<State> result = new ArrayList<>();
        result.add(new TaskTwo());
        result.add(new EndGameFailed());
        return result;
    }

    @Override
    public State onEnter(State previousState) throws InterruptedException {
        LogicTaskOne logicTaskOne = new LogicTaskOne();
        logicTaskOne.setAnswer(Input.readInt());
        System.out.println("Твой ответ :" + logicTaskOne.getAnswer());
        Thread.sleep(5000);
        if (logicTaskOne.getAnswer() != 5) {
            System.out.println("Твой ответ не верен попробуй еще раз\n");
            Thread.sleep(1000);
            return previousState;
        }
        System.out.println("Ты ответил правильно, посмотрим сможешь ли ты решить" +
                " еще оду задачку\n");
        Thread.sleep(2000);
        return this;
    }
}