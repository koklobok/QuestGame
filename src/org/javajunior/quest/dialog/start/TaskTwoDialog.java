package org.javajunior.quest.dialog.start;

import org.javajunior.quest.dialog.DialogLink;
import org.javajunior.quest.dialog.end.BattleWithDragon;
import org.javajunior.quest.dialog.end.EndGameDragonWins;
import org.javajunior.quest.dialog.task.AbstractTaskDialog;
import org.javajunior.quest.dialog.task.LogicTask;
import org.javajunior.quest.dialog.task.LogicTaskTwo;

import java.util.ArrayList;
import java.util.List;

public class TaskTwoDialog extends AbstractTaskDialog {

    @Override
    public List<DialogLink> getOptions() {
        List<DialogLink> result = new ArrayList<>();
        result.add(new BattleWithDragon());
        result.add(new EndGameDragonWins());
        return result;
    }

    @Override
    protected LogicTask getLogicTask() {
        return new LogicTaskTwo();
    }

    @Override
    public String getDescription() {
        return "Решить еще одну задачу";
    }
}
