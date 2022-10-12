package kick;

import java.util.Random;
import characters.Character;

public interface Kick {
    Random randomDamage = new Random();
    void kick(Character attacker, Character defender);
}
