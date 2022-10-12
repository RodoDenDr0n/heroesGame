package characters;

import lombok.Getter;
import lombok.ToString;

import java.util.Random;

@Getter @ToString
public abstract class Character {
    public static Random random = new Random();
    private int hp;
    private int power;
    Character(int power, int health) {
        this.power = power;
        this.hp = health;
    }

    public abstract void kick(Character character);
    public void setHp(int hp) {
        this.hp = hp < 0 ? 0 : hp;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isAlive() {
        return hp > 0;
    }
}
