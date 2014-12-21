package pl.dmichalski.c01_15_bean_inheritence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c01_15_bean_inheritence.sequence.SequenceGenerator;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c01_15/spring_context.xml");

        SequenceGenerator sequenceGenerator =
                context.getBean("sequenceGenerator2", SequenceGenerator.class);

        String sequence = sequenceGenerator.getSequence();
        System.out.println(sequence);
    }

}
