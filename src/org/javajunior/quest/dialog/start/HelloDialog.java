package org.javajunior.quest.dialog.start;

import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.dialog.AbstractState;
import org.javajunior.quest.dialog.end.EndGameFailed;
import org.javajunior.quest.dialog.State;

import java.util.ArrayList;
import java.util.List;

public class HelloDialog extends AbstractState {

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
    protected void printHello() {
        System.out.println("\t\tПриветствуем тебя! \n" +
                "В наш дом пришла пришла беда, злобный двуглавый Дракон разрушил наши прекрасные деревни, " +
                "\nубил прекрасных непьющих роботяг и их семьи.  У тебя есть возможность добраться к нему  " +
                "\nи отомстить. Если ты храбр и готов то пойди и наваляй ему!!!\n");
    }

}
