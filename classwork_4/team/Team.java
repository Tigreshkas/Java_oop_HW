package classwork_4.team;

import classwork_4.items.DistanceAttacker;
import classwork_4.items.Warrior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team<T extends Warrior> {
    private final List<T> team = new ArrayList<>();
    private final String name;

    public Team(String name) {
        this.name = name;
    }

    public Team<T> addWarrior(T warrior) {
        team.add(warrior);
        return this;
    }

    public int getMaxDistance() {
        int distance = 0;
        for (T item : team) {
            if (!(item instanceof DistanceAttacker)) {
                continue;
            }
            DistanceAttacker temp = (DistanceAttacker) item;
            if (temp.getDistance() > distance) {
                distance = temp.getDistance();
            }
        }
        return distance;
    }

    public int getTeamDamage() {
        int sum = 0;
        for (T item : team) {
            sum += item.getMaxDamage();
        }
        return sum;
    }

    public int getTeamArmour() {
        ArrayList<Integer> all_value = new ArrayList<>();
        for (T item : team) {
            all_value.add(item.getMinArmour());
        }
        return Collections.min(all_value);
    }

    @Override
    public String toString() {
        StringBuilder teamBuilder = new StringBuilder();
        for (T item : team) {
            teamBuilder.append(item.toString()).append("\n");
        }
        return String.format("Team{ team= %s, maxDistance = %d, maxDamage = %d, minArmour = %d \n%s}", name, getMaxDistance(), getTeamDamage(),getTeamArmour() ,teamBuilder);
    }
}