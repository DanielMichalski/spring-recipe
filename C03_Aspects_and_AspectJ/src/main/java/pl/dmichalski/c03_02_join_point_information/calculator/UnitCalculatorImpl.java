package pl.dmichalski.c03_02_join_point_information.calculator;

/**
 * Author: Daniel
 */
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
