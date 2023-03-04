package classwork_2;

public class Cow extends Herbiveres implements Flyable {

    private int flightSpeed = 13;
    private int flightHigh = 2;

    public Cow(String name) {
        super(name);
    }


    @Override
    public String say() {
        return "Muuu!";
    }

    @Override
    public int getSpeedFlyable() {
        return this.flightSpeed;
    }

    @Override
    public int getHigh() {
        return this.flightHigh;
    }

}
