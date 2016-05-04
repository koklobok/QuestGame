package org.javajunior.quest.dialog.path;

import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.dialog.AbstractState;
import org.javajunior.quest.dialog.State;

import java.util.ArrayList;
import java.util.List;


public class SelectPathDialog extends AbstractState {
    @Override
    public String[] getPossibleMoves() {
        return new String[]{"Пойти через дремучий лес","Пойти через непроходимое, вязкое болото \n"};
    }

    @Override
    public List<State> getTransitionTable() {
        List<State> result = new ArrayList<>();
        result.add(new GoToForest());
        result.add(new GoToBog());
        return result;
    }

    @Override
    protected void printHello() {
        System.out.println("\tДля того чтобы добратся до дракона тебе придется пройти сложный но захватывающий путь.\n" +
                 "ты стоишь на распутье двух дорог.\nОдна через дремучий лес, вторая через зловонное болото.\n" +
                "Выбери какием путем ты хочешь добраться к дракону.\n");
    }

}
