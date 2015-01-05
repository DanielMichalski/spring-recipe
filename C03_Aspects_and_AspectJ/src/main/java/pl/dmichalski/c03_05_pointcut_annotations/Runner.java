package pl.dmichalski.c03_05_pointcut_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c03_05_pointcut_annotations.calculator.UnitCalculator;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c03_05/spring_context.xml");

        UnitCalculator unitCalculator = context.getBean("unitCalculatorImpl", UnitCalculator.class);

        unitCalculator.kilogramToPound(10);
    }

}
