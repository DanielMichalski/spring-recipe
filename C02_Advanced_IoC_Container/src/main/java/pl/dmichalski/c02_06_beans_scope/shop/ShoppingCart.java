package pl.dmichalski.c02_06_beans_scope.shop;

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

    public List<Product> getItems() {
        return items;
    }

}
