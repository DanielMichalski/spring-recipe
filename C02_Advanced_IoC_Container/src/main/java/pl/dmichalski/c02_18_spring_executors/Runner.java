package pl.dmichalski.c02_18_spring_executors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c02_18_spring_executors.thread.SpringExecutor;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c02_18/spring_config.xml");

        SpringExecutor springExecutor =
                context.getBean("springExecutor", SpringExecutor.class);

        springExecutor.submitJobs();
    }

}
