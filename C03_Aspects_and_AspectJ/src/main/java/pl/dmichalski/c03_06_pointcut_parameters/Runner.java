package pl.dmichalski.c03_06_pointcut_parameters;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c03_06_pointcut_parameters.calculator.UnitCalculator;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c03_06/spring_context.xml");

        UnitCalculator unitCalculator = context.getBean("unitCalculatorImpl", UnitCalculator.class);

        unitCalculator.kilogramToPound(10);
    }

}
