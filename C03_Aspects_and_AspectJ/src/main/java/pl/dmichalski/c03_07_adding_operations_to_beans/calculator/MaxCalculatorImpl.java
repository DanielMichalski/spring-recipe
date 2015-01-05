package pl.dmichalski.c03_07_adding_operations_to_beans.calculator;

/**
 * Author: Daniel
 */
public class MaxCalculatorImpl implements MaxCalculator {

    @Override
    public double max(double a, double b) {
        double result = Math.max(a, b);
        System.out.printf("max(%.2f, %.2f) = %.2f \n", a, b, result);
        return result;
    }

}
