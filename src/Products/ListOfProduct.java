package Products;

import java.util.HashSet;
import java.util.Objects;

public class ListOfProduct {
    private final HashSet<Product> listOfProduct = new HashSet<>();

    public void addToList(Product product) {
        listOfProduct.add(product);
    }

    public HashSet<Product> getListOfProduct() {
        return listOfProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListOfProduct that = (ListOfProduct) o;
        return listOfProduct.equals(that.listOfProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfProduct);
    }

    @Override
    public String toString() {
        return "Список продуктов{" + listOfProduct + '}';
    }
}
