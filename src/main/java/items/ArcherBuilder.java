package items;

import Shield.Shield;
import weapons.Bow;

public class ArcherBuilder {
    private String name;
    private Bow weapon;

    private Shield shield;

    public ArcherBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ArcherBuilder setWeapon(Bow weapon) {
        this.weapon = weapon;
        return this;
    }

    public ArcherBuilder setShield(Shield shield)
    {
        this.shield = shield;
        return this;
    }

    public Archer createArcher() {
        return new Archer(name, weapon, shield);
    }
}