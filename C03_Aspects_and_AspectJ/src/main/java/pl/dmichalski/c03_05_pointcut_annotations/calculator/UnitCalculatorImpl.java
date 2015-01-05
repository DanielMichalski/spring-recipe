package pl.dmichalski.c03_05_pointcut_annotations.calculator;

import org.springframework.stereotype.Component;
import pl.dmichalski.c03_05_pointcut_annotations.annotation.LoggingRequired;

/**
 * Author: Daniel
 */
@Component
public class UnitCalculatorImpl implements UnitCalculator {

    @Override
    @LoggingRequired
    public double kilogramToPound(double kilogram) {
        double pound = kilogram * 2.2;
        System.out.printf("%.2f kg = %.2f pound \n", kilogram, pound);
        return pound;
    }

    @Override
    @LoggingRequired
    public double kilometerToMile(double kilometer) {
        double mile = kilometer * 0.62;
        System.out.printf("%.2f km = %.2f mile  \n", kilometer, mile);
        return mile;
    }

}
