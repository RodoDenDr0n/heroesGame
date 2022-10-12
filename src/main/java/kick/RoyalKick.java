package kick;

import characters.Character;

public interface RoyalKick extends Kick {
    @Override
    default void kick(Character attacker, Character defender) {
        defender.setHp(defender.getHp() - randomDamage.nextInt(attacker.getPower()));
    }
}
