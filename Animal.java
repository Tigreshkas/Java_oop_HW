package classwork_2;

import classwork_2.radio.Sayable;

public abstract class Animal implements Sayable {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String feed();


    @Override
    public String toString() {
        StringBuilder srt = new StringBuilder();
        if (this instanceof Runable) {
            srt.append(" скорость бега -> " + ((Runable) this).getSpeedRun());
        }
        if (this instanceof Flyable) {
            srt.append(" скорость полета -> " + ((Flyable) this).getSpeedFlyable());
        }
        if (this instanceof Swimming) {
            srt.append(" скорость плавания -> " + ((Swimming) this).getSpeedSwim());
        }
        return String.format("%s ест %s," + srt, this.name, this.feed());
    }
}
