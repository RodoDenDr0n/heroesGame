package drivers;

import characters.*;
import characters.Character;

import java.util.Random;

public class CharacterFactory {
    public static Random random = new Random();
    public Character createCharacter() {
        int randomizer = random.nextInt(0, 4);
        return switch (randomizer) {
            case 1 -> new Elf();
            case 2 -> new King();
            case 3 -> new Knight();
            default -> new Hobbit();
        };
    }
}
