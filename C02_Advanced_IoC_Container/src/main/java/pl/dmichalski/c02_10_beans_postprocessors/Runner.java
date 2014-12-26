package pl.dmichalski.c02_10_beans_postprocessors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c02_10_beans_postprocessors.shop.Cashier;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c02_10/spring_config.xml");

        Cashier cashier = context.getBean("cashier", Cashier.class);
        System.out.println(cashier);
    }

}
