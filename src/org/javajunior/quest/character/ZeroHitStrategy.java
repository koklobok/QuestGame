package org.javajunior.quest.character;

public class ZeroHitStrategy extends AbstractHitStrategy {
    @Override
    public int hit(Weapon weapon) {
        return 0;
    }
}
