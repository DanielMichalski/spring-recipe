package pl.dmichalski.c02_18_spring_executors.thread;

import org.apache.commons.lang.exception.ExceptionUtils;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Author: Daniel
 */
public class DemonstrationRunnable implements Runnable {

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(ExceptionUtils.getFullStackTrace(e));
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println("Now: " + new Date());
    }

}
