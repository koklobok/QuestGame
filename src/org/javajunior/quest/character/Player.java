package org.javajunior.quest.character;

import java.util.PrimitiveIterator;

public class Player {

    public enum Race {
        HUMAN, ELF
    }
    private String name;
    private Race race;

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }
}
