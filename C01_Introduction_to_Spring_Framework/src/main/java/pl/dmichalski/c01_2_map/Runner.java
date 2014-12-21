package pl.dmichalski.c01_2_map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c01_2_map.sequence.SequenceGenerator;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c01_2/spring_context.xml");

        SequenceGenerator sequenceGenerator =
                context.getBean("sequenceGenerator1", SequenceGenerator.class);

        String sequence = sequenceGenerator.getSequence();
        System.out.println(sequence);
    }

}
