package pl.dmichalski.c02_05_spring_expression_language.spel;

/**
 * Author: Daniel
 */
public class EmailUtilities {

    private double randomNumber;

    private String email;

    private String password;

    private String host;

    public double getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(double randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "EmailUtilities{" +
                "randomNumber=" + randomNumber +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", host='" + host + '\'' +
                '}';
    }
}
