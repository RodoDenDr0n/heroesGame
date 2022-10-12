package characters;

import kick.ElfKick;

public class Elf extends Character implements ElfKick {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character defender) {
        kick(this, defender);
    }

    @Override
    public String toString() {
        return String.format("Elf{hp=%s, power=%s}", getHp(), getPower());
    }
}
