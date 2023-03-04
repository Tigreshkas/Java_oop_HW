package classwork_2;

public class Crocodile extends Predator implements Runable, Flyable, Swimming {

    private int runSpeed = 100;
    private int flightSpeed = 15;
    private int flightHigh = 5;

    private int runSwim = 10;
    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Shhhhh!";
    }

    @Override
    public int getSpeedFlyable() {
        return this.flightSpeed;
    }

    @Override
    public int getHigh() {
        return this.flightHigh;
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }

    @Override
    public int getSpeedSwim() {
        return this.runSwim;
    }
}
