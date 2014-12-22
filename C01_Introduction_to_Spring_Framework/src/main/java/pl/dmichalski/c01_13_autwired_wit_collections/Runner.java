package pl.dmichalski.c01_13_autwired_wit_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c01_13_autwired_wit_collections.sequence.SequenceGeneratorWithMap;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("c01_13/spring_context.xml");

        SequenceGeneratorWithMap sequenceGenerator =
                context.getBean("sequenceGeneratorWithMap", SequenceGeneratorWithMap.class);

        String sequence = sequenceGenerator.getSequence();
        System.out.println(sequence);
    }

}
