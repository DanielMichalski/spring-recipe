package pl.dmichalski.c02_15_custom_properties_editor_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c02_15_custom_properties_editor_1.shop.ProductRanking;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c02_15/spring_config.xml");

        ProductRanking productRanking = context.getBean("productRanking", ProductRanking.class);

        System.out.println("Product ranking from: " + productRanking.getFromDate() + " to: " + productRanking.getToDate());

    }

}
