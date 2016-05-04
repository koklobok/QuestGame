package org.javajunior.quest.character;

import java.util.Random;

/**
 * Base implementation of hitting strategy
 */
public abstract class AbstractHitStrategy implements HitStrategy{
    private final Random random = new Random(47);

    protected int randomInt(int bound) {
        return random.nextInt(bound);
    }
}
