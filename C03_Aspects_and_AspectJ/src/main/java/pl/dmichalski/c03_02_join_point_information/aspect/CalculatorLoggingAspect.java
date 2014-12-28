package pl.dmichalski.c03_02_join_point_information.aspect;

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

    @Pointcut("execution(* pl.dmichalski.c03_02_join_point_information..*(..))")
    public void allMethods() {}

    @Before("allMethods()")
    public void logJoinPoint(JoinPoint joinPoint) {
        log.info("JoinPint kind: " + joinPoint.getKind());
        log.info("Signature type: " + joinPoint.getSignature().getDeclaringTypeName());
        log.info("Signature name: " + joinPoint.getSignature().getName());
        log.info("Args: " + Arrays.toString(joinPoint.getArgs()));
        log.info("Target class: " + joinPoint.getTarget().getClass().getName());
        log.info("This object class: " + joinPoint.getThis().getClass().getName());
    }
}
