package pl.dmichalski.c02_02_factory_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c02_02_factory_bean.shop.Battery;
import pl.dmichalski.c02_02_factory_bean.shop.Disc;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c02_02/spring_context.xml");

        Battery battery = context.getBean("aaa", Battery.class);
        Disc disc = context.getBean("cdrw", Disc.class);

        System.out.println(battery);
        System.out.println(disc);
    }

}
