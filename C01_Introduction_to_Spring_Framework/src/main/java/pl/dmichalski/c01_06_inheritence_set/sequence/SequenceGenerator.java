package pl.dmichalski.c01_06_inheritence_set.sequence;

import java.util.Set;

/**
 * Author: Daniel
 */
public class SequenceGenerator {

    private PrefixGenerator prefixGenerator;

    private Set<String> suffixes;

    private int initial;

    private int counter;

    public SequenceGenerator() {
    }

    public SequenceGenerator(PrefixGenerator prefixGenerator, Set<String> suffixes, int initial) {
        this.prefixGenerator = prefixGenerator;
        this.suffixes = suffixes;
        this.initial = initial;
    }

    public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
        this.prefixGenerator = prefixGenerator;
    }

    public void setSuffixes(Set<String> suffixes) {
        this.suffixes = suffixes;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public synchronized String getSequence() {
        StringBuilder sBuffer = new StringBuilder();
        sBuffer.append(prefixGenerator.generate());
        sBuffer.append(initial + counter++);
        for (Object suffix : suffixes) {
            sBuffer.append("-");
            sBuffer.append(suffix);
        }
        return sBuffer.toString();
    }
}
