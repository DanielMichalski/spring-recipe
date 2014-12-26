package pl.dmichalski.c02_08_java_config.model;

/**
 * Author: Daniel
 */
public class Person {

    private String name;

    private Cat cat;

    public void startLife() {
        System.out.println("Person lives");
    }

    public void die() {
        System.out.println("Person died");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

}
