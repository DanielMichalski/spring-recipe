package pl.dmichalski.c02_08_java_config.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.dmichalski.c02_08_java_config.model.Cat;
import pl.dmichalski.c02_08_java_config.model.Person;

/**
 * Author: Daniel
 */
@Configuration
public class PersonConfiguration {

    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean(initMethod = "startLife", destroyMethod = "die")
    public Person josh() {
        Person josh = new Person();
        josh.setName("josh");
        josh.setCat(cat());
        return josh;
    }

}
