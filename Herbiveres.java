package classwork_2;

public abstract class Herbiveres extends Animal {

    public Herbiveres(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Grass";
    }

}
