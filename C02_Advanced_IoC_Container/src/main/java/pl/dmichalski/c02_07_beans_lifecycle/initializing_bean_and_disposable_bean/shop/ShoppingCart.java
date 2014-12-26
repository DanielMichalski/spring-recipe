package pl.dmichalski.c02_07_beans_lifecycle.initializing_bean_and_disposable_bean.shop;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
public class ShoppingCart {

    private List<pl.dmichalski.c02_07_beans_lifecycle.initializing_bean_and_disposable_bean.shop.Product> items = new ArrayList<>();

    public void addItem(pl.dmichalski.c02_07_beans_lifecycle.initializing_bean_and_disposable_bean.shop.Product item) {
        this.items.add(item);
    }

    public void setItems(List<pl.dmichalski.c02_07_beans_lifecycle.initializing_bean_and_disposable_bean.shop.Product> items) {
        this.items = items;
    }

    public List<pl.dmichalski.c02_07_beans_lifecycle.initializing_bean_and_disposable_bean.shop.Product> getItems() {
        return items;
    }

}
