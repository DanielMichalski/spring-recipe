package pl.dmichalski.c01_10_factoryBean.factory;

import org.springframework.beans.factory.config.AbstractFactoryBean;
import pl.dmichalski.c01_10_factoryBean.product.Product;

/**
 * Author: Daniel
 */
public class DiscountFactoryBean extends AbstractFactoryBean {

    private Product product;

    private double discount;

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public Class<?> getObjectType() {
        return product.getClass();
    }

    @Override
    protected Object createInstance() throws Exception {
        product.setPrice(product.getPrice() * (1-discount));
        return product;
    }

}
