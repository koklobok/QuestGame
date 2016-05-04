package org.javajunior.quest.dialog.path;

import org.javajunior.quest.dialog.SelectOptionDialogLink;
import org.javajunior.quest.dialog.DialogLink;

import java.util.ArrayList;
import java.util.List;


public class SelectPathDialog extends SelectOptionDialogLink {

    @Override
    public List<DialogLink> getOptions() {
        List<DialogLink> result = new ArrayList<>();
        result.add(new GoToForest());
        result.add(new GoToSwamp());
        return result;
    }

    @Override
    protected void printHello() {
        System.out.println("\tДля того чтобы добратся до дракона тебе придется пройти сложный но захватывающий путь.\n" +
                 "ты стоишь на распутье двух дорог.\nОдна через дремучий лес, вторая через зловонное болото.\n" +
                "Выбери какием путем ты хочешь добраться к дракону.\n");
    }

    @Override
    public String getDescription() {
        return "Вернутся к выбору пути";
    }
}
