package pl.dmichalski.c01_13_autwired_wit_collections.sequence;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Author: Daniel
 */
public class SequenceGeneratorWithMap {

    @Autowired
    private Map<String, PrefixGenerator> prefixGenerators;

    private List<Object> suffixes;

    private int initial;

    private int counter;

    public SequenceGeneratorWithMap() {
    }

    public SequenceGeneratorWithMap(Map<String, PrefixGenerator> prefixGenerators, List<Object> suffixes, int initial) {
        this.prefixGenerators = prefixGenerators;
        this.suffixes = suffixes;
        this.initial = initial;
    }

    public void setSuffixes(List<Object> suffixes) {
        this.suffixes = suffixes;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public synchronized String getSequence() {
        StringBuilder sBuffer = new StringBuilder();
        for (Map.Entry<String, PrefixGenerator> entry : prefixGenerators.entrySet()) {
            sBuffer.append(entry.getValue().getPrefix());
        }
        sBuffer.append(initial + counter++);
        for (Object suffix : suffixes) {
            sBuffer.append("-");
            sBuffer.append(suffix);
        }
        return sBuffer.toString();
    }
}
