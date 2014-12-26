package pl.dmichalski.c02_08_java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c02_08_java_config.model.Person;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c02_08/spring_config.xml");

        Person person = context.getBean("josh", Person.class);
        System.out.println(person);
    }

}
