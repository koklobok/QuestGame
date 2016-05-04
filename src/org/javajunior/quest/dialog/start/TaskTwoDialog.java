package org.javajunior.quest.dialog.start;

import org.javajunior.quest.dialog.State;
import org.javajunior.quest.dialog.end.BattleWithDragon;
import org.javajunior.quest.dialog.end.EndGameDragonWins;
import org.javajunior.quest.dialog.task.AbstractTaskDialog;
import org.javajunior.quest.dialog.task.LogicTask;
import org.javajunior.quest.dialog.task.LogicTaskOne;
import org.javajunior.quest.dialog.task.LogicTaskTwo;

import java.util.ArrayList;
import java.util.List;

public class TaskTwoDialog extends AbstractTaskDialog {
    @Override
    public String[] getPossibleMoves() {
        return new String[]{"Сразится с драконом ", "Не хватает смелости \n"};
    }

    @Override
    public List<State> getTransitionTable() {
        List<State> result = new ArrayList<>();
        result.add(new BattleWithDragon());
        result.add(new EndGameDragonWins());
        return result;
    }

    @Override
    protected LogicTask getLogicTask() {
        return new LogicTaskTwo();
    }

}
