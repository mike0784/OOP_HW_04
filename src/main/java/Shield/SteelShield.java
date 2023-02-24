package Shield;

import weapons.Weapon;
/*Стальной щит*/
public class SteelShield extends Shield{
    public int protection = 30;

    @Override
    public int getProtection() {
        return this.protection;
    }
}
