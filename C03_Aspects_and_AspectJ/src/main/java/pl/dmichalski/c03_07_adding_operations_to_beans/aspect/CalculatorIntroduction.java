package pl.dmichalski.c03_07_adding_operations_to_beans.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;
import pl.dmichalski.c03_07_adding_operations_to_beans.calculator.MaxCalculator;
import pl.dmichalski.c03_07_adding_operations_to_beans.calculator.MaxCalculatorImpl;
import pl.dmichalski.c03_07_adding_operations_to_beans.calculator.MinCalculator;
import pl.dmichalski.c03_07_adding_operations_to_beans.calculator.MinCalculatorImpl;

/**
 * Author: Daniel
 */
@Aspect
@Component
public class CalculatorIntroduction {

    @DeclareParents(
            value = "pl.dmichalski.c03_07_adding_operations_to_beans.calculator.ArithmeticCalculatorImpl",
            defaultImpl = MaxCalculatorImpl.class)
    private MaxCalculator maxCalculator;

    @DeclareParents(
            value = "pl.dmichalski.c03_07_adding_operations_to_beans.calculator.ArithmeticCalculatorImpl",
            defaultImpl = MinCalculatorImpl.class)
    private MinCalculator minCalculator;

}
