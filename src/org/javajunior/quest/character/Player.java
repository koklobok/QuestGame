package org.javajunior.quest.character;

import org.javajunior.quest.util.Input;

public class Player {

    private String name;
    private Race race;
    private HitStrategy hitStrategy;
    private int health = 50;

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(Race race) {
        if (race == null) {
            throw new IllegalArgumentException("Race couldn't be null ");
        }
        this.race = race;
        switch (race) {
            case HUMAN: hitStrategy = new HumanHitStrategy();
                break;
            case PROGRAMMER: hitStrategy = new ProgrammerHitStrategy();
                break;
            case DWARF: hitStrategy = new DwarfHitStrategy();
                break;
            default: hitStrategy = new ZeroHitStrategy();
        }
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public void selectRace() {
        System.out.println("Выбери свою расу:");
        int inputNumber = 0;
        while (true) {
            Race[] races = Race.values();
            for (int i = 0; i < races.length; i++) {
                System.out.println("" + (i + 1) + " - " + races[i]);
            }
            inputNumber = Input.readInt();
            if ((inputNumber > 0) && (inputNumber <= races.length)) {
                break;
            }
        }
        this.setRace(Race.values()[inputNumber - 1]);
    }

    public int getHealth() {
        return health;
    }

    public int getHitValue(Weapon weapon) {
        return hitStrategy.hit(weapon);
    }

    public void consumeHit(int hitValue) {
        if (race != Race.DWARF) {
            health -= hitValue;
        }
    }
}
