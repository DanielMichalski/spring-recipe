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
@Order(1)
public class CalculatorLoggingAspect {

    private Log log = LogFactory.getLog(this.getClass());

    @Pointcut("execution(* pl.dmichalski.c03_03_aspects_order..*(..))")
    public void allMethods() {}

    @Before("allMethods()")
    public void logJoinPoint(JoinPoint joinPoint) {
        log.info("Signature type: " + joinPoint.getSignature().getDeclaringTypeName());
    }
}
