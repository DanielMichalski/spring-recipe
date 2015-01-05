package pl.dmichalski.c03_08_injecting_to_domain_objects.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * Author: Daniel
 */
@Configurable(value = "complex")
public class Complex {

    private int real;

    private int imaginary;

    @Autowired
    private ComplexFormatter formatter;

    public Complex() {

    }

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return formatter.format(this);
    }

}
