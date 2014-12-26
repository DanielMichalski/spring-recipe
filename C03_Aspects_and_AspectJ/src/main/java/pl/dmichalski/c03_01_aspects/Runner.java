package pl.dmichalski.c03_01_aspects;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c03_01_aspects.calculator.ArithmeticCalculator;
import pl.dmichalski.c03_01_aspects.calculator.UnitCalculator;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c03_01/spring_context.xml");

        ArithmeticCalculator arithmeticCalculator = context.getBean("arithmeticCalculator", ArithmeticCalculator.class);
        arithmeticCalculator.add(1, 2);
        arithmeticCalculator.sub(4, 3);
        arithmeticCalculator.mul(2, 3);
        arithmeticCalculator.div(4, 2);

        UnitCalculator unitCalculator = context.getBean("unitCalculator", UnitCalculator.class);
        unitCalculator.kilogramToPound(10);
        unitCalculator.kilometerToMile(5);
    }

}
