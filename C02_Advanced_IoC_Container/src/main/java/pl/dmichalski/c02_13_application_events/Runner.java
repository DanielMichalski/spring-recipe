package pl.dmichalski.c02_13_application_events;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c02_13_application_events.shop.Battery;
import pl.dmichalski.c02_13_application_events.shop.Cashier;
import pl.dmichalski.c02_13_application_events.shop.ShoppingCart;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c02_13/spring_config.xml");

        Cashier cashier = context.getBean("cashier", Cashier.class);

        ShoppingCart shoppingCart = new ShoppingCart();
        Battery aaa = new Battery("aaa", 2.5);
        Battery aa = new Battery("aa", 3.5);
        shoppingCart.addItem(aaa);
        shoppingCart.addItem(aa);

        cashier.checkout(shoppingCart);

    }

}
