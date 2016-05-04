package org.javajunior.quest.dialog.task;

import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.dialog.AbstractState;
import org.javajunior.quest.dialog.State;
import org.javajunior.quest.util.Input;

public abstract class AbstractTaskDialog extends AbstractState {

    protected abstract LogicTask getLogicTask();

    @Override
    protected void printHello() {

    }

    @Override
    public State onEnter(State previousState, PlayerAware playerAware) {
        LogicTask logicTaskOne = getLogicTask();
        if (logicTaskOne.checkAnswer(Input.readInt())) {
            return super.onEnter(previousState, playerAware);
        } else {
            return previousState;
        }
    }
}
