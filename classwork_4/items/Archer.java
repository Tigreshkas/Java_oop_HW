package classwork_4.items;

import classwork_4.Armour.Lats;
import classwork_4.weapons.Bow;

public class Archer extends Warrior<Bow, Lats> implements DistanceAttacker {
    private final int distance;

    public Archer(String name, Bow weapon, Lats armour) {
        super(name, weapon, armour);
        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public Archer(String name, Bow weapon) {
        super(name, weapon);
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