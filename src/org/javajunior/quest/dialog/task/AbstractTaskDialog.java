package org.javajunior.quest.dialog.task;

import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.dialog.SelectOptionDialogLink;
import org.javajunior.quest.dialog.DialogLink;
import org.javajunior.quest.util.Input;

public abstract class AbstractTaskDialog extends SelectOptionDialogLink {

    protected abstract LogicTask getLogicTask();

    @Override
    protected void printHello() {

    }

    @Override
    public DialogLink nextDialog(DialogLink previousState, PlayerAware playerAware) {
        LogicTask logicTaskOne = getLogicTask();
        if (logicTaskOne.checkAnswer(Input.readInt())) {
            return super.nextDialog(previousState, playerAware);
        } else {
            return previousState;
        }
    }
}
