package pl.dmichalski.c03_01_aspects.calculator;

/**
 * Author: Daniel
 */
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

    @Override
    public double add(double a, double b) {
        double result = a + b;
        System.out.printf("%.2f + %.2f = %.2f \n", a, b, result);
        return result;
    }

    @Override
    public double sub(double a, double b) {
        double result = a - b;
        System.out.printf("%.2f - %.2f = %.2f \n", a, b, result);
        return result;
    }

    @Override
    public double mul(double a, double b) {
        double result = a * b;
        System.out.printf("%.2f * %.2f = %.2f \n", a, b, result);
        return result;
    }

    @Override
    public double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divide by zero");
        }
        double result = a / b;
        System.out.printf("%.2f / %.2f = %.2f \n", a, b, result);
        return result;
    }
}
