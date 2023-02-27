package classwork_1;

import java.util.Date;

public class Perishable extends Product {

    private final Date expireDate;

    public Perishable(String name, double cost, Date expireDate) {
        super(name, cost);
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" годен до %s", expireDate.toString());
    }
}
