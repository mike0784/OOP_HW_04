package items;

import weapons.Weapon;
import Shield.Shield;

import java.util.Random;

public abstract class Warrior<T extends Weapon> {
    private String name;
    protected T weapon;
    protected Shield shield;
    protected Random rnd = new Random();
    private int healthPoint;


    public Warrior(String name, T weapon, Shield shield) {
        this.name = name;
        this.weapon = weapon;
        healthPoint = 100;
        this.shield = shield;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void reduceHealthPoint(int damage) {
        this.healthPoint = this.healthPoint + shield.getProtection() - damage;
    }

    public int hitDamage(Warrior enemy) {
        int damage = rnd.nextInt(weapon.damage());
        enemy.reduceHealthPoint(damage);
        return damage;
    }

    public int getMaxDamage() {
        return weapon.damage();
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                ", healthPoint=" + healthPoint +
                '}';
    }
}
