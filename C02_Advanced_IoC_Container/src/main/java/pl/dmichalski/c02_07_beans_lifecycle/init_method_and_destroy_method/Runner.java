package pl.dmichalski.c02_07_beans_lifecycle.init_method_and_destroy_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c02_07_beans_lifecycle.init_method_and_destroy_method.shop.Cashier;
import pl.dmichalski.c02_07_beans_lifecycle.init_method_and_destroy_method.shop.ShoppingCart;

import java.io.IOException;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) throws IOException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c02_07/init_method_and_destroy_method/spirng_context.xml");

        Cashier cashier = context.getBean("cashier", Cashier.class);
        ShoppingCart shopingCart = context.getBean("shopingCart", ShoppingCart.class);

        cashier.checkout(shopingCart);
    }

}
