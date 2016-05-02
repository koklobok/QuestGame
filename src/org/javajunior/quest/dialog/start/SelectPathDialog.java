package org.javajunior.quest.dialog.start;

import org.javajunior.quest.dialog.EndGameFailed;
import org.javajunior.quest.dialog.State;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krunch on 02.05.2016.
 */
public class SelectPathDialog implements State {
    @Override
    public String[] getPossibleMoves() {
        return new String[]{"Пойти через дремучий лес","Пойти через непроходимое, вязкое болото \n"};
    }

    @Override
    public List<State> getTransitionTable() {
        List<State> result = new ArrayList<>();
        result.add(new EndGameFailed());
        result.add(new GoToBog());
        return result;
    }

    @Override
    public State onEnter(State previousState) {
        System.out.println("\tДля того чтобы добратся до дракона тебе придется пройти сложный но захватывающий путь.\n" +
                 "ты стоишь на распутье двух дорог.\nОдна через дремучий лес, вторая через зловонное болото.\n" +
                "Выбери какием путем ты хочешь добраться к дракону.\n");
        return this;
    }
}
