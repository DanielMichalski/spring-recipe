package pl.dmichalski.c04_01_scripts;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c04_01_scripts.interest.InterestCalculator;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c04_01/spring_context.xml");

        InterestCalculator interestCalculatorGroovy =
                context.getBean("interestCalculatorGroovy", InterestCalculator.class);
        System.out.println(interestCalculatorGroovy.calculate(100000, 1));
    }

}
