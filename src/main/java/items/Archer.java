package items;

import Shield.Shield;
import weapons.Bow;

public class Archer extends Warrior<Bow> implements DistanceAttacker {
    private int distance;


    public Archer(String name, Bow weapon, Shield shield) {
        super(name, weapon, shield);

        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = Archer{" +
                "distance=" + distance +
                '}';
    }
}
