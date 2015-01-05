package pl.dmichalski.c03_05_pointcut_annotations.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Author: Daniel
 */
@Aspect
@Component
public class CalculatorLoggingAspect {

    private Log log = LogFactory.getLog(this.getClass());

    @Pointcut("@annotation(pl.dmichalski.c03_05_pointcut_annotations.annotation.LoggingRequired)")
    public void loggingMethods() {}

    @Before("loggingMethods()")
    public void logBefore(JoinPoint joinPoint) {
        log.info("ASPECT - Before calling method: " + joinPoint.getSignature().getName());
    }

    @After("loggingMethods()")
    public void logAfter(JoinPoint joinPoint) {
        log.info("ASPECT - After calling method: " + joinPoint.getSignature().getName());
    }

}
