package org.javajunior.quest.character;


public enum Race {
    HUMAN("Нормальный человек"),
    PROGRAMMER("Не нормальный человек - Программист"),
    DWARF("Пьяный гном карлик");

    private final String description;

    Race(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return description;
    }
}
