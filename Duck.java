package classwork_2;

public class Duck extends Herbiveres implements Flyable, Runable, Swimming{
    private int flightSpeed = 15;
    private int runSpeed = 10;
    private int flightHigh = 5;
    private int runSwim = 15;
    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Krya Krya!";
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
