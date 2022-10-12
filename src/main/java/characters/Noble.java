package characters;

import kick.RoyalKick;

abstract class Noble extends Character implements RoyalKick {
    Noble() {
        super(random.nextInt(0, 10), random.nextInt(0, 10));
    }
}
