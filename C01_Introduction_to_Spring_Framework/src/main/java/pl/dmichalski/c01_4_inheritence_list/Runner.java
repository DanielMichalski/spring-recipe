package pl.dmichalski.c01_4_inheritence_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c01_4_inheritence_list.sequence.SequenceGenerator;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c01_4/spring_context.xml");

        SequenceGenerator sequenceGenerator =
                context.getBean("sequenceGenerator", SequenceGenerator.class);

        String sequence = sequenceGenerator.getSequence();
        System.out.println(sequence);
    }

}
