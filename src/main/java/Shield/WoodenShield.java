package Shield;

import weapons.Weapon;
/*Деревянный щит*/
public class WoodenShield extends Shield{
    public int protection = 10;

    @Override
    public int getProtection() {
        return this.protection;
    }
}
