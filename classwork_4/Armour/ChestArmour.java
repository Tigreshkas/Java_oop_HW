package classwork_4.Armour;

import classwork_4.weapons.Weapon;

public class ChestArmour implements Armour {
    @Override
    public int protection() {
        return 5;
    }

    @Override
    public String toString() {
        return "Protection of chest armour = " + protection();
    }
}