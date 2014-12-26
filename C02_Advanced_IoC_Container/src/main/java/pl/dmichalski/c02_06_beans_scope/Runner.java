package pl.dmichalski.c02_06_beans_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c02_06_beans_scope.shop.Product;
import pl.dmichalski.c02_06_beans_scope.shop.ShoppingCart;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c02_06/spring_context.xml");

        Product aaa = context.getBean("aaa", Product.class);
        Product cdrw = context.getBean("cdrw", Product.class);
        Product dvdrw = context.getBean("dvdrw", Product.class);

        ShoppingCart cart1 = context.getBean("shopingCart", ShoppingCart.class);
        cart1.addItem(aaa);
        cart1.addItem(cdrw);
        System.out.println("Basket1 contains: " + cart1.getItems());

        ShoppingCart cart2 = context.getBean("shopingCart", ShoppingCart.class);
        cart2.addItem(dvdrw);
        System.out.println("Basket2 contains: " + cart2.getItems());
    }

}
