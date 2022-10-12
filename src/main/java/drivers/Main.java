package drivers;

import characters.Character;

public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        CharacterFactory characterFactory = new CharacterFactory();
        Character character1; Character character2;
        while (true) {
            character1 = characterFactory.createCharacter();
            character2 = characterFactory.createCharacter();
            gameManager.fight(character1, character2);
        }
    }
}

