package kick;

import characters.Character;

public interface HobbitKick extends Kick {
    @Override
    default void kick(Character attacker, Character defender) {

    }
}
