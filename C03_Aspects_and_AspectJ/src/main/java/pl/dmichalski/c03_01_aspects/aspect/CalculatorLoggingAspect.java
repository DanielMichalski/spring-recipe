package pl.dmichalski.c03_01_aspects.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * Author: Daniel
 */
@Aspect
public class CalculatorLoggingAspect {

    private Log log = LogFactory.getLog(this.getClass());

    @Pointcut("execution(* *.*(..))")
    public void allMethods() {}

    @Before("allMethods()")
    public void logBefore(JoinPoint joinPoint) {
        log.info("Method " + joinPoint.getSignature().getName() + "() with parameters: " +
                Arrays.toString(joinPoint.getArgs()));
    }

    @After("allMethods()")
    public void logAfter(JoinPoint joinPoint) {
        log.info("Method " + joinPoint.getSignature().getName() + "() finished");
    }

    @AfterReturning(value = "allMethods()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        log.info("Method " + joinPoint.getSignature().getName() + "() returned: " + result);
    }

    @AfterThrowing(value = "allMethods()")
    public void logAfterThrowing(JoinPoint joinPoint) {
        log.error("An exception has been thrown after calling method: " +
            joinPoint.getSignature().getName() + "()");
    }

    @Before("execution(* pl.dmichalski.c03_01_aspects.calculator.ArithmeticCalculator.add(..))")
    public void logBefore() {
        log.info("Beginning of add method");
    }

}
