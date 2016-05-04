package org.javajunior.quest.dialog.path;

import org.javajunior.quest.dialog.SelectOptionDialogLink;
import org.javajunior.quest.dialog.DialogLink;
import org.javajunior.quest.dialog.start.TaskOneDialog;

import java.util.ArrayList;
import java.util.List;

public class GoToSwamp extends SelectOptionDialogLink {

    @Override
    public List<DialogLink> getOptions() {
        List<DialogLink> result = new ArrayList<>();
        result.add(new TaskOneDialog());
        result.add(new SelectPathDialog());
        return result;
    }

    @Override
    protected void printHello() {
        System.out.println("Странник твоя смелость не знает предела, ты попал в вязкое, мокрое и ужасное болото.\n" +
                "Для того что бы пройти через него тебе придется решить несколько задач.\n");
    }

    @Override
    public String getDescription() {
        return "Пойти через непроходимое, вязкое болото";
    }
}
