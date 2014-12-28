package pl.dmichalski.c02_11_property_placeholder.shop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.io.File;

/**
 * Author: Daniel
 */
public class PathCheckBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof StorageConfig) {
            String path = ((StorageConfig) bean).getPath();
            File file = new File(path);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
