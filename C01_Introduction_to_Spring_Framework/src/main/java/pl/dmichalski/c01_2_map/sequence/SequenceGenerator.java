package pl.dmichalski.c01_2_map.sequence;

import java.util.Map;

/**
 * Author: Daniel
 */
public class SequenceGenerator {

    private String prefix;

    private Map<Object, Object> suffixes;

    private int initial;

    private int counter;

    public SequenceGenerator() {
    }

    public SequenceGenerator(String prefix, Map<Object, Object> suffixes, int initial) {
        this.prefix = prefix;
        this.suffixes = suffixes;
        this.initial = initial;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffixes(Map<Object, Object> suffixes) {
        this.suffixes = suffixes;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public synchronized String getSequence() {
        StringBuilder sBuffer = new StringBuilder();
        sBuffer.append(prefix);
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
