package classwork_4.items;

import classwork_4.Armour.Armour;
import classwork_4.weapons.Weapon;

import java.util.Random;

public abstract class Warrior<T extends Weapon, T2 extends Armour> {
    private final String name;
    protected T weapon;
    protected Random rnd = new Random();
    private int healthPoint;
    protected T2 armour;

    public Warrior(String name, T weapon) {
        this.name = name;
        this.weapon = weapon;
        healthPoint = 100;
    }

    public Warrior(String name, T weapon, T2 armour) {
        this.name = name;
        this.weapon = weapon;
        this.armour = armour;
        healthPoint = 100;
    }


    public int getHealthPoint() {
        return healthPoint;
    }

    public void reduceHealthPoint(int damage, int protect) {
        int real_damage = Math.max((damage - protect), 0);
        this.healthPoint = this.healthPoint - (real_damage);
    }

    public int hitDamage(Warrior enemy) {
        int protect;
        int damage = rnd.nextInt(weapon.damage());
        protect = armour.protection();
        enemy.reduceHealthPoint(damage, protect);
        return damage;
    }

    public int getMaxDamage() {
        return weapon.damage();
    }

    public int getMinArmour(){
        return  armour.protection();
    }


    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                ", healthPoint=" + healthPoint +
                ", armour =" + armour +
                '}';
    }
}