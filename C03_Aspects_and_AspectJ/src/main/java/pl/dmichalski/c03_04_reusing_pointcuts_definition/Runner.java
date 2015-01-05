package pl.dmichalski.c03_04_reusing_pointcuts_definition;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c03_04_reusing_pointcuts_definition.calculator.UnitCalculator;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c03_04/spring_context.xml");

        UnitCalculator unitCalculator = context.getBean("unitCalculatorImpl", UnitCalculator.class);

        unitCalculator.kilogramToPound(10);
    }

}
