package org.javajunior.quest.dialog;

import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.util.Input;
import org.javajunior.quest.util.ThreadUtils;

import java.util.Collections;
import java.util.List;

/**
 * Abstract class that represents select from several options dialog
 */
public abstract class SelectOptionDialogLink implements DialogLink {

    /**
     * Returns list of options to go from this dialog
     */
    protected List<DialogLink> getOptions() {
        return Collections.emptyList();
    }

    /**
     * Returns a string that is printed when this dialog is started.
     *
     * Template method, indented to be inherited in subclasses.
     */
    protected abstract void printHello();

    /**
     * @inherit
     */
    @Override
    public DialogLink nextDialog(DialogLink previousState, PlayerAware playerAware) {
        printHello();

        System.out.println("Сделай ход:");
        List<DialogLink> moves = getOptions();
        int moveNumber = 0;
        while ((moveNumber <= 0) || (moveNumber > moves.size())) {
            for (int i = 0; i < moves.size(); i++) {
                System.out.println("" + (i + 1) + " - " + moves.get(i).getDescription());
            }
            System.out.println("");
            moveNumber = Input.readInt();
        }
        return moves.get(moveNumber - 1);
    }
}
