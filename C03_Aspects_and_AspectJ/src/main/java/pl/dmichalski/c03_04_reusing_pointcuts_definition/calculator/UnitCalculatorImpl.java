package pl.dmichalski.c03_04_reusing_pointcuts_definition.calculator;

import org.springframework.stereotype.Component;

/**
 * Author: Daniel
 */
@Component
public class UnitCalculatorImpl implements UnitCalculator {

    @Override
    public double kilogramToPound(double kilogram) {
        double pound = kilogram * 2.2;
        System.out.printf("%.2f kg = %.2f pound \n", kilogram, pound);
        return pound;
    }

    @Override
    public double kilometerToMile(double kilometer) {
        double mile = kilometer * 0.62;
        System.out.printf("%.2f km = %.2f mile  \n", kilometer, mile);
        return mile;
    }

}
