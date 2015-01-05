package pl.dmichalski.c03_08_injecting_to_domain_objects.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import pl.dmichalski.c03_08_injecting_to_domain_objects.calculator.Complex;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Daniel
 */
@Aspect
@Component
public class ComplexCachingAspect {



}
