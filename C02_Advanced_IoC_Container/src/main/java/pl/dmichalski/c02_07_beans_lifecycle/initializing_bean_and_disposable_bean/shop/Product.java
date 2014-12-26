package pl.dmichalski.c02_07_beans_lifecycle.initializing_bean_and_disposable_bean.shop;

/**
 * Author: Daniel
 */
public abstract class Product {

    public static final Product AAA = new pl.dmichalski.c02_07_beans_lifecycle.initializing_bean_and_disposable_bean.shop.Battery("AAA", 2.5);

    public static final Product CDRW = new pl.dmichalski.c02_07_beans_lifecycle.initializing_bean_and_disposable_bean.shop.Disc("CD-RW", 1.5);

    private String name;

    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
