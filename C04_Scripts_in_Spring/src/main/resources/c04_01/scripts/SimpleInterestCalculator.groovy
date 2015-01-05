package c04_01.scripts

import pl.dmichalski.c04_01_scripts.interest.InterestCalculator

/**
 * Author: Daniel
 */
class SimpleInterestCalculator implements InterestCalculator{

    double rate

    @Override
    double calculate(double amount, double year) {
        return amount * year * rate
    }

}
