package pl.dmichalski.c01_11_required_annotation.sequence;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;

/**
 * Author: Daniel
 */
public class SequenceGenerator {


    private String prefix;

    private List<Object> suffixes;

    private int initial;

    private int counter;

    public SequenceGenerator() {
    }

    public SequenceGenerator(String prefix, List<Object> suffixes, int initial) {
        this.prefix = prefix;
        this.suffixes = suffixes;
        this.initial = initial;
    }

    @Required
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Required
    public void setSuffixes(List<Object> suffixes) {
        this.suffixes = suffixes;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public synchronized String getSequence() {
        StringBuilder sBuffer = new StringBuilder();
        sBuffer.append(prefix);
        sBuffer.append(initial + counter++);
        for (Object suffix : suffixes) {
            sBuffer.append("-");
            sBuffer.append(suffix);
        }
        return sBuffer.toString();
    }
}
