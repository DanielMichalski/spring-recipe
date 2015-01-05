package pl.dmichalski.c03_03_aspects_order.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Author: Daniel
 */
@Aspect
@Component
@Order(0)
public class CalculatorValidatorAspect {

    private Log log = LogFactory.getLog(this.getClass());

    @Pointcut("execution(* pl.dmichalski.c03_03_aspects_order.calculator.UnitCalculator.*(double))")
    public void beforeCalculatorMethods() {}

    @Before("beforeCalculatorMethods()")
    public void validateBefore(JoinPoint joinPoint) {
        for (Object arg : joinPoint.getArgs()) {
            validate((Double) arg);
        }
    }

    private void validate(Double arg) {
        if (arg < 0) {
            throw new IllegalArgumentException("Only positive values");
        }
    }
}
