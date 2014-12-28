package pl.dmichalski.c02_11_property_placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c02_11_property_placeholder.shop.Cashier;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c02_11/spring_config.xml");

        Cashier cashier = context.getBean("cashier", Cashier.class);
        System.out.println(cashier);
    }

}
