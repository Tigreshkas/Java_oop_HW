package classwork_4.Armour;

public class Lats implements Armour{
    @Override
    public int protection() {
        return 3;
    }

    @Override
    public String toString() {
        return "Protection of lats = " + protection();
    }
}