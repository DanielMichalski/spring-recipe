package pl.dmichalski.c01_14_qualifier.sequence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * Author: Daniel
 */
public class SequenceGenerator {

    @Autowired
    @Qualifier("datePrefixGenerator")
    private PrefixGenerator prefixGenerator;

    private List<Object> suffixes;

    private int initial;

    private int counter;

    public SequenceGenerator() {
    }

    public SequenceGenerator(PrefixGenerator prefixGenerator, List<Object> suffixes, int initial) {
        this.prefixGenerator = prefixGenerator;
        this.suffixes = suffixes;
        this.initial = initial;
    }

    public void setPrefixGenerators(PrefixGenerator prefixGenerator) {
        this.prefixGenerator = prefixGenerator;
    }

    public void setSuffixes(List<Object> suffixes) {
        this.suffixes = suffixes;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public synchronized String getSequence() {
        StringBuilder sBuffer = new StringBuilder();
        sBuffer.append(prefixGenerator.getPrefix());
        sBuffer.append(initial + counter++);
        for (Object suffix : suffixes) {
            sBuffer.append("-");
            sBuffer.append(suffix);
        }
        return sBuffer.toString();
    }
}
