package pl.dmichalski.c03_03_aspects_order;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c03_03_aspects_order.calculator.UnitCalculator;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c03_03/spring_context.xml");

        UnitCalculator unitCalculator = context.getBean("unitCalculatorImpl", UnitCalculator.class);

        unitCalculator.kilogramToPound(10);
    }

}
