package classwork_1;


public class Alcohol extends Product {
    public Alcohol(String name, double cost) {
        super(name, cost);
    }

    @Override
    public String toString() {
        return super.toString() + " (Алкоголь!) 18+ ";
    }
}
