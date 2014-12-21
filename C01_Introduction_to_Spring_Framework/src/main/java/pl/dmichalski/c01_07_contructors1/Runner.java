package pl.dmichalski.c01_07_contructors1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c01_07_contructors1.shop.Battery;
import pl.dmichalski.c01_07_contructors1.shop.Disc;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c01_07/spring_context.xml");

        Battery battery = context.getBean("aaa1", Battery.class);
        Disc disc = context.getBean("cdrw1", Disc.class);

        System.out.println(battery);
        System.out.println(disc);
    }

}
