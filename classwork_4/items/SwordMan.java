package classwork_4.items;

import classwork_4.Armour.ChestArmour;
import classwork_4.weapons.Sword;

public class SwordMan extends Warrior<Sword, ChestArmour>{
    public SwordMan(String name, Sword weapon, ChestArmour armour) {
        super(name, weapon, armour);
    }


    @Override
    public String toString() {
        return super.toString() + " Type = SwordMan";
    }
}