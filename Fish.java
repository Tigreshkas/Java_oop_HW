package classwork_2;

public class Fish extends Herbiveres implements Swimming {
    private int runSwim = 20;

    public Fish(String name) { super(name); }


    @Override
    public String say() { return "Bul! Bul!"; }

    @Override
    public int getSpeedSwim() { return this.runSwim; }
}
