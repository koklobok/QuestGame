package org.javajunior.quest.character;

/**
 * Implements hitting strategy by human
 */
public class HumanHitStrategy extends AbstractHitStrategy {
    @Override
    public int hit(Weapon weapon) {
        int maxHit = 30;
        switch (weapon) {
            case SWORD: maxHit += 21;
                break;
            case GUN: maxHit += 21;
                break;
            case BOOK: maxHit += 21;
                break;
        }

        return randomInt(maxHit);
    }
}
