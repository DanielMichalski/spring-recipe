package pl.dmichalski.c02_11_property_placeholder.shop;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Author: Daniel
 */
public class Cashier implements BeanNameAware, StorageConfig {

    private String name;

    private String path;

    @Override
    public void setBeanName(String s) {
        this.name = s;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
