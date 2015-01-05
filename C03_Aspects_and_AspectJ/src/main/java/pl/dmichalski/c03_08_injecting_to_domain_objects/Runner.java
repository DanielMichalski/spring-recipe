package pl.dmichalski.c03_08_injecting_to_domain_objects;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c03_08_injecting_to_domain_objects.calculator.Complex;
import pl.dmichalski.c03_08_injecting_to_domain_objects.calculator.ComplexCalculator;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c03_08/spring_context.xml");

        ComplexCalculator complexCalculator =
                context.getBean("complexCalculatorImpl", ComplexCalculator.class);

        complexCalculator.add(new Complex(1, 2), new Complex(2, 3));
        complexCalculator.sub(new Complex(5, 8), new Complex(2, 3));
    }

}
