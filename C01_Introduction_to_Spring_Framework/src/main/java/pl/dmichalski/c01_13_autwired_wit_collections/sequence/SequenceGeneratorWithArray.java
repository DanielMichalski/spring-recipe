package pl.dmichalski.c01_13_autwired_wit_collections.sequence;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Author: Daniel
 */
public class SequenceGeneratorWithArray {

    @Autowired
    private PrefixGenerator[] prefixGenerators;

    private List<Object> suffixes;

    private int initial;

    private int counter;

    public SequenceGeneratorWithArray() {
    }

    public SequenceGeneratorWithArray(PrefixGenerator[] prefixGenerators, List<Object> suffixes, int initial) {
        this.prefixGenerators = prefixGenerators;
        this.suffixes = suffixes;
        this.initial = initial;
    }

    public void setPrefixGenerators(PrefixGenerator[] prefixGenerators) {
        this.prefixGenerators = prefixGenerators;
    }

    public void setSuffixes(List<Object> suffixes) {
        this.suffixes = suffixes;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public synchronized String getSequence() {
        StringBuilder sBuffer = new StringBuilder();
        for (PrefixGenerator prefixGenerator : prefixGenerators) {
            sBuffer.append(prefixGenerator.getPrefix());
        }
        sBuffer.append(initial + counter++);
        for (Object suffix : suffixes) {
            sBuffer.append("-");
            sBuffer.append(suffix);
        }
        return sBuffer.toString();
    }
}
