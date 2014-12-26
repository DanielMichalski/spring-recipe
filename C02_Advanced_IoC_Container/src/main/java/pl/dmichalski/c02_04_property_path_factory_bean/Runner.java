package pl.dmichalski.c02_04_property_path_factory_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c02_04_property_path_factory_bean.shop.Battery;
import pl.dmichalski.c02_04_property_path_factory_bean.shop.Disc;
import pl.dmichalski.c02_04_property_path_factory_bean.shop.Product;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c02_04/spring_context.xml");

        Product bestSeller = context.getBean("bestSeller", Product.class);

        System.out.println(bestSeller);
    }

}
