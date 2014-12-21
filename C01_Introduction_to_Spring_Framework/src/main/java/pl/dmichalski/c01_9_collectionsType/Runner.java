package pl.dmichalski.c01_9_collectionsType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c01_9_collectionsType.sequence.SequenceGenerator;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c01_9/spring_context.xml");

        SequenceGenerator sequenceGenerator =
                context.getBean("sequenceGenerator", SequenceGenerator.class);

        String sequence = sequenceGenerator.getSequence();
        System.out.println(sequence);

    }

}
