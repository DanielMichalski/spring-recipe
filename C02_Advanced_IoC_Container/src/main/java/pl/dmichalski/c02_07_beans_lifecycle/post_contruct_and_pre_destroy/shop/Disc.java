package pl.dmichalski.c02_07_beans_lifecycle.post_contruct_and_pre_destroy.shop;

/**
 * Author: Daniel
 */
public class Disc extends Product {

    private int capacity;

    public Disc() {
    }

    public Disc(String name, double price) {
        super(name, price);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Disc{");
        sb.append("capacity=").append(capacity);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
