package classwork_2;

public class Goat extends Herbiveres implements Runable {
    private int runSpeed = 4;
    public Goat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Beee!";
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}
