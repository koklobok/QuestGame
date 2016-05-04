package org.javajunior.quest.character;

/**
 * Implements hitting zero strategy
 */
public class ZeroHitStrategy extends AbstractHitStrategy {
    @Override
    public int hit(Weapon weapon) {
        return 0;
    }
}
