package pl.dmichalski.c01_07_contructors1.shop;

/**
 * Author: Daniel
 */
public class Battery extends Product {

    private boolean rechargeable;

    public Battery() {
        super();
    }

    public Battery(String name, double price) {
        super(name, price);
    }

    public boolean isRechargeable() {
        return rechargeable;
    }

    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Battery{");
        sb.append("rechargeable=").append(rechargeable);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
