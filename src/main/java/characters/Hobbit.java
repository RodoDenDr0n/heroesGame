package characters;

import kick.HobbitKick;

public class Hobbit extends Character implements HobbitKick {
    public Hobbit() {
        super(0, 3);
    }

    public void toCry() {
        System.out.println("Hobbit is crying!");
    }

    @Override
    public void kick(Character defender) {
        kick(this, defender);
        toCry();
    }

    @Override
    public String toString() {
        return String.format("Hobbit{hp=%s, power=%s}", getHp(), getPower());
    }
}
