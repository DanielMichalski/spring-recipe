package pl.dmichalski.c01_5_inheritence_map.sequence;

import java.util.Map;

/**
 * Author: Daniel
 */
public class SequenceGenerator {

    private PrefixGenerator prefixGenerator;

    private Map<Object, Object> suffixes;

    private int initial;

    private int counter;

    public SequenceGenerator() {
    }

    public SequenceGenerator(PrefixGenerator prefixGenerator, Map<Object, Object> suffixes, int initial) {
        this.prefixGenerator = prefixGenerator;
        this.suffixes = suffixes;
        this.initial = initial;
    }

    public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
        this.prefixGenerator = prefixGenerator;
    }

    public void setSuffixes(Map<Object, Object> suffixes) {
        this.suffixes = suffixes;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public synchronized String getSequence() {
        StringBuilder sBuffer = new StringBuilder();
        sBuffer.append(prefixGenerator.generate());
        sBuffer.append(initial + counter++);
        for (Map.Entry entry : suffixes.entrySet()) {
            sBuffer.append("-");
            sBuffer.append(entry.getKey());
            sBuffer.append("@");
            sBuffer.append(entry.getValue());
        }
        return sBuffer.toString();
    }
}
