package org.javajunior.quest.dialog.start;

import org.javajunior.quest.dialog.end.EndGameFailed;
import org.javajunior.quest.dialog.State;
import org.javajunior.quest.dialog.task.AbstractTaskDialog;
import org.javajunior.quest.dialog.task.LogicTask;
import org.javajunior.quest.dialog.task.LogicTaskOne;

import java.util.ArrayList;
import java.util.List;

public class TaskOneDialog extends AbstractTaskDialog {
    @Override
    public String[] getPossibleMoves() {
        return new String[]{"Решить еще одну задачу", "Сдатья и уйти с позором \n"};
    }

    @Override
    public List<State> getTransitionTable() {
        List<State> result = new ArrayList<>();
        result.add(new TaskTwoDialog());
        result.add(new EndGameFailed());
        return result;
    }

    @Override
    protected LogicTask getLogicTask() {
        return new LogicTaskOne();
    }
}
