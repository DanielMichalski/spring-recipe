package pl.dmichalski.c03_04_reusing_pointcuts_definition.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Author: Daniel
 */
@Aspect
@Component
public class CalculatorLoggingAspect {

    private Log log = LogFactory.getLog(this.getClass());

    @Pointcut("execution(* pl.dmichalski.c03_04_reusing_pointcuts_definition.calculator..*(..))")
    public void allMethods() {}

    @Before("allMethods()")
    public void logBefore(JoinPoint joinPoint) {
        log.info("ASPECT - Calling method: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(value = "allMethods()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        log.info("ASPECT - Returned object: " + result);
    }

    @AfterThrowing(value = "allMethods()", throwing = "e")
    public void logAfterReturning(JoinPoint joinPoint, Throwable e) {
        log.info("ASPECT - Exception: " + e);
    }

}
