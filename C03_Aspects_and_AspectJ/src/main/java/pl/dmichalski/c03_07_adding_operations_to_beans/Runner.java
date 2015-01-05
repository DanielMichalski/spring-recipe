package pl.dmichalski.c03_07_adding_operations_to_beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c03_07_adding_operations_to_beans.calculator.ArithmeticCalculatorImpl;
import pl.dmichalski.c03_07_adding_operations_to_beans.calculator.MaxCalculator;
import pl.dmichalski.c03_07_adding_operations_to_beans.calculator.MinCalculator;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c03_07/spring_context.xml");

        ArithmeticCalculatorImpl arithmeticCalculator = context.getBean("arithmeticCalculatorImpl", ArithmeticCalculatorImpl.class);

        MaxCalculator maxCalculator = (MaxCalculator) arithmeticCalculator;
        maxCalculator.max(1, 2);

        MinCalculator minCalculator = (MinCalculator) arithmeticCalculator;
        minCalculator.min(1, 2);
    }

}
