package pl.dmichalski.c02_07_beans_lifecycle.init_method_and_destroy_method.shop;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
public class ShoppingCart {

    private List<Product> items = new ArrayList<>();

    public void addItem(Product item) {
        this.items.add(item);
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public List<Product> getItems() {
        return items;
    }

}
