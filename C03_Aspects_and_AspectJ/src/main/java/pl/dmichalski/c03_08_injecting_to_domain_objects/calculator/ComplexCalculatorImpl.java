package pl.dmichalski.c03_08_injecting_to_domain_objects.calculator;

import org.springframework.stereotype.Component;

/**
 * Author: Daniel
 */
@Component
public class ComplexCalculatorImpl implements ComplexCalculator {

    @Override
    public Complex add(Complex a, Complex b) {
        Complex result = new Complex(a.getReal() + b.getReal(),
                a.getImaginary() + b.getImaginary());
        System.out.printf("%s + %s = %s \n", a, b, result);
        return result;
    }

    @Override
    public Complex sub(Complex a, Complex b) {
        Complex result = new Complex(a.getReal() - b.getReal(),
                a.getImaginary() - b.getImaginary());
        System.out.printf("%s - %s = %s \n", a, b, result);
        return result;
    }
    
}
