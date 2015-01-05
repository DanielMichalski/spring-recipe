package pl.dmichalski.c03_05_pointcut_annotations.annotation;

import java.lang.annotation.*;

/**
 * Author: Daniel
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoggingRequired {
}
