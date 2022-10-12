package kick;

import characters.Character;

public interface ElfKick extends Kick {
    @Override
    default void kick(Character attacker, Character defender) {
        if (defender.getPower() < attacker.getPower()
                && defender.getHp() < attacker.getHp()) {
            defender.setHp(0);
            System.out.println("Elf kills the enemy!");
        } else {
            defender.setPower(defender.getPower() - 1);
            System.out.println("Elf wounds the enemy!");
        }
    }
}
