package pl.dmichalski.c02_12_i18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c02_11_property_placeholder.shop.Cashier;

import java.util.Date;
import java.util.Locale;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c02_12/spring_config.xml");

        Object[] parameters = {4, new Date()};

        String alertUS = context.getMessage("alert.checkout", parameters, Locale.US);
        System.out.println("alertUS = " + alertUS);

        String alertPL = context.getMessage("alert.checkout", parameters, new Locale("pl_PL"));
        System.out.println("alertPL = " + alertPL);
    }

}
