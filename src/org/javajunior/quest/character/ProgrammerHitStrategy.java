package org.javajunior.quest.character;

/**
 * Implements hitting strategy by programmer
 */

public class ProgrammerHitStrategy extends AbstractHitStrategy {
    @Override
    public int hit(Weapon weapon) {
        int maxHit = 0;
        switch (weapon) {
            case SWORD: maxHit = 21;
                break;
            case GUN: maxHit = 41;
                break;
            case BOOK: maxHit = 6;
                break;
        }

        return randomInt(maxHit);
    }
}
