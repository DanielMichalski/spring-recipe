package pl.dmichalski.c02_05_spring_expression_language.spel;

import org.springframework.beans.factory.annotation.Value;
import pl.dmichalski.c02_05_spring_expression_language.spel.EmailUtilities;

import java.util.Properties;

/**
 * Author: Daniel
 */
public class SpELExample {

    @Value("#{systemProperties}")
    private Properties properties;

    @Value("#{systemProperties['user.dir']}")
    private String userRegion;

    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    @Value("#{emailUtilities.email}")
    private String email;

    @Value("#{emailUtilities.password}")
    private String password;

    @Value("#{emailUtilities.host}")
    private String host;

    @Value("#{emailUtilities}")
    private EmailUtilities emailUtilities;

    @Value("#{emailUtilities.randomNumber}")
    private double randomNumberFromEmailUtilities;

    @Override
    public String toString() {
        return "SpELExample{" +
                "properties=" + properties +
                ", userRegion='" + userRegion + '\'' +
                ", randomNumber=" + randomNumber +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", host='" + host + '\'' +
                ", emailUtilities=" + emailUtilities +
                ", randomNumberFromEmailUtilities=" + randomNumberFromEmailUtilities +
                '}';
    }
}
