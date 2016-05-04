package org.javajunior.quest.character;

/**
 * Implements hitting strategy by dwarf
 */
public class DwarfHitStrategy extends AbstractHitStrategy {
    @Override
    public int hit(Weapon weapon) {
        int maxHit = 0;
        switch (weapon) {
            case SWORD: maxHit = 16;
                break;
            case GUN: maxHit = 21;
                break;
            case BOOK: maxHit = 51;
                break;
        }

        return randomInt(maxHit);
    }
}
