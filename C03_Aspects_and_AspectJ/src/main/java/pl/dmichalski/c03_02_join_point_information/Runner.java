package pl.dmichalski.c03_02_join_point_information;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c03_02_join_point_information.calculator.UnitCalculator;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c03_02/spring_context.xml");

        UnitCalculator unitCalculator = context.getBean("unitCalculator", UnitCalculator.class);

        unitCalculator.kilogramToPound(10);
    }

}
