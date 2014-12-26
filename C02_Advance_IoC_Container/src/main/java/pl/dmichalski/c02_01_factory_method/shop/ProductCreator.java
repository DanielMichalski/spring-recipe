package pl.dmichalski.c02_01_factory_method.shop;

/**
 * Author: Daniel
 */
public class ProductCreator {

    public static Product createProduct(String productId) {
        if ("aaa".equals(productId)) {
            return new Battery("AAA", 2.5);
        } else if ("cdrw".equals(productId)) {
            return new Disc("CDRW", 1.5);
        }

        throw new IllegalArgumentException("Product not found");
    }

}
