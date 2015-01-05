package pl.dmichalski.c03_06_pointcut_parameters.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Author: Daniel
 */
@Aspect
@Component
public class CalculatorLoggingAspect {

    private Log log = LogFactory.getLog(this.getClass());

    @Pointcut("within(pl.dmichalski.c03_06_pointcut_parameters.calculator.UnitCalculator+)")
    public void unitCalculatorMethods() {}

    @Before("unitCalculatorMethods() && args(a)")
    public void logParameter(double a) {
        log.info("ASPECT - Argument: " + a);
    }

}
