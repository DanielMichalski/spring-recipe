package pl.dmichalski.c02_16_custom_properties_editor_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c02_16_custom_properties_editor_2.shop.Product;
import pl.dmichalski.c02_16_custom_properties_editor_2.shop.ProductRanking;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c02_16/spring_config.xml");

        ProductRanking productRanking = context.getBean("productRanking", ProductRanking.class);
        Product bestSeller = productRanking.getBestSeller();

        System.out.println(bestSeller);

    }

}
