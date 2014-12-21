package pl.dmichalski.c01_10_factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c01_10_factoryBean.product.Battery;
import pl.dmichalski.c01_10_factoryBean.product.Disc;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c01_10/spring_context.xml");

        Battery battery = context.getBean("aaa", Battery.class);
        Disc disc = context.getBean("cdrw", Disc.class);

        System.out.println(battery);
        System.out.println(disc);
    }

}
