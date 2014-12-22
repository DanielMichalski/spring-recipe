package pl.dmichalski.c01_09_collections_type.sequence;


import java.text.DecimalFormat;
import java.util.List;

/**
 * Author: Daniel
 */
public class SequenceGenerator {

    private PrefixGenerator prefixGenerator;

    private List<Integer> suffixex;

    private int initial;

    private int counter;

    public SequenceGenerator() {
    }

    public SequenceGenerator(PrefixGenerator prefixGenerator, List<Integer> suffixes, int initial) {
        this.prefixGenerator = prefixGenerator;
        this.suffixex = suffixes;
        this.initial = initial;
    }

    public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
        this.prefixGenerator = prefixGenerator;
    }

    public void setSuffixex(List<Integer> suffixex) {
        this.suffixex = suffixex;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public synchronized String getSequence() {
        StringBuilder sBuffer = new StringBuilder();
        sBuffer.append(prefixGenerator.getPrefix());
        sBuffer.append(initial + counter++);

        DecimalFormat formatter = new DecimalFormat("0000");
        for (int suffix : suffixex) {
            sBuffer.append("-");
            sBuffer.append(formatter.format((Integer) suffix));
        }

        return sBuffer.toString();
    }
}
