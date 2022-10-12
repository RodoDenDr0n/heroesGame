package drivers;

import characters.Character;

public class GameManager {
    void fight (Character character1, Character character2) {
        while (character1.isAlive() || character2.isAlive()) {
            character1.kick(character2);
            character2.kick(character1);
        }
        System.out.println(character1.isAlive()? "Character one wins!" : "Character two wins!");
    }
}
