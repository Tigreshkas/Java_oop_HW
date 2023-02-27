package classwork_1;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    protected List<Product> localList = new ArrayList<>();

    public List<Product> getLocalList() {
        return localList;
    }

    private double cash;

    public void addProduct(Product inputProduct) {
        localList.add(inputProduct);
        inputProduct.setLoadDate(Date.valueOf(LocalDate.now()));
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder();
        for (Product product : localList) {
            localString.append(product.toString());
            localString.append("\n");
        }
        localString.append(cash).append("\n");
        return localString.toString();
    }

    public List<Product> findProduct(String name) {
        List<Product> foundProducts = new ArrayList<>();
        for (Product product : localList) {
            if (product.getName().contains((name))) {
                foundProducts.add(product);
            }
        }
        return foundProducts;
    }

    public Product sellProduct(Product sallingProduct) {
        Product sellProduct = new Product();
        if (localList.contains(sallingProduct)) {
            for (int i = 0; i < localList.size(); i++) {
                if (localList.get(i) == sallingProduct) {
                    sellProduct = localList.get(i);
                    localList.remove(i);
                    cash += sellProduct.getCost();
                    return sellProduct;
                }
            }
        }
        return sellProduct;
    }

}
