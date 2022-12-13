package Products;

import java.util.HashMap;
import java.util.Objects;

public class Recipe {
    private int price;
    private final HashMap<Product, Integer> recipe = new HashMap<>();

    public final void addToRec(Product product) {
        this.recipe.put(product, 1);
    }

    public final void addToRec(Product product, Integer amount) {
        this.recipe.put(product, amount);
        this.price += product.getPrice() * amount;
    }

    public final int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe1 = (Recipe) o;
        return recipe.equals(recipe1.recipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipe);
    }

    @Override
    public String toString() {
        return "Рецепт{" + recipe + " Стоимость: " + getPrice() +
                '}';
    }
}
