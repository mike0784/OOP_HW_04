package items;

import Shield.Shield;
import weapons.Sword;

public class SwordMan extends Warrior<Sword> {
    public SwordMan(String name, Sword weapon, Shield shield) {
        super(name, weapon, shield);
    }


    @Override
    public String toString() {
        return super.toString() + " Type = SwordMan";
    }
}
