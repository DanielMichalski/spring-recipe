package pl.dmichalski.c01_13_autwired_wit_collections.sequence;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: Daniel
 */
public class DatePrefixGenerator implements PrefixGenerator {

    private DateFormat formatter;

    public void setPattern(String pattern) {
        this.formatter = new SimpleDateFormat(pattern);
    }

    @Override
    public String getPrefix() {
        return formatter.format(new Date());
    }

}
