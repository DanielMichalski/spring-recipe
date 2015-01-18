package pl.dmichalski.c05_01_spring_security;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c05_01/spring_context.xml");
    }

}
