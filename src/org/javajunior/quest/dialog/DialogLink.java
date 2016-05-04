package org.javajunior.quest.dialog;

import org.javajunior.quest.character.PlayerAware;

/**
 * Represents one dialog in a game. Each game must provide next dialog, if it' null than game is over.
 */
public interface DialogLink {

    /**
     * Runs this dialog and returns next dialog link
     */
    DialogLink nextDialog(DialogLink previousState, PlayerAware playerAware);

    /**
     * Returns string description of this dialog link that can be used as menu name
     */
    String getDescription();
}
