package pl.dmichalski.c02_05_spring_expression_language;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c02_05_spring_expression_language.spel.SpELExample;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c02_05/spring_context.xml");

        SpELExample spELExample = context.getBean("spELExample", SpELExample.class);
        System.out.println(spELExample);
    }

}
