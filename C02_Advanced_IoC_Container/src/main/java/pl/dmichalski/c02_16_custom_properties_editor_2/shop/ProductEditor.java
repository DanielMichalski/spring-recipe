package pl.dmichalski.c02_16_custom_properties_editor_2.shop;

import java.beans.PropertyEditorSupport;

/**
 * Author: Daniel
 */
public class ProductEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        Product product = (Product) getValue();
        return product.getClass().getName() + "," +
                product.getName() + "," +
                product.getPrice();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] parts = text.split(",");
        try {
            Product product = (Product) Class.forName(parts[0]).newInstance();
            product.setName(parts[1]);
            product.setPrice(Double.parseDouble(parts[2]));
            setValue(product);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }
}
