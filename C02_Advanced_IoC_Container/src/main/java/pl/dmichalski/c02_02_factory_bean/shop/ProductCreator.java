package pl.dmichalski.c02_02_factory_bean.shop;

import java.util.Map;

/**
 * Author: Daniel
 */
public class ProductCreator {

    private Map<String, Product> products;

    public void setProducts(Map<String, Product> products) {
        this.products = products;
    }

    public Product createProduct(String productId) {
        Product product = products.get(productId);
        if (product != null) {
            return product;
        }
        throw new IllegalArgumentException("Product not found");
    }

}
