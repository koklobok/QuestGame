package org.javajunior.quest.dialog;

import org.javajunior.quest.character.PlayerAware;

import java.util.List;

/**
 * Represents state in game.
 */
public interface State {

    State onEnter(State previousState, PlayerAware playerAware);

}
