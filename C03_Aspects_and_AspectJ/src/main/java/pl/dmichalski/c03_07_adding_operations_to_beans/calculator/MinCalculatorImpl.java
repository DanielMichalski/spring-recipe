package pl.dmichalski.c03_07_adding_operations_to_beans.calculator;

/**
 * Author: Daniel
 */
public class MinCalculatorImpl implements MinCalculator {

    @Override
    public double min(double a, double b) {
        double result = Math.min(a, b);
        System.out.printf("min(%.2f, %.2f) = %.2f \n", a, b, result);
        return result;
    }

}
