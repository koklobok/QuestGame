package org.javajunior.quest.character;


public enum Weapon {
    SWORD("Меч"),
    GUN("Пистолет"),
    BOOK("Книга 'Joshua Bloch - Effective Java'");

    private final String description;

    Weapon(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return description;
    }
}
