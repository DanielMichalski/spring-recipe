package pl.dmichalski.c06_02.filter;

import java.util.Arrays;
import java.util.Map;

/**
 * Author: Daniel
 */
public class CityServiceRequestAuditor {

    public void log(Map<String, String[]> attributes) {
        for (Map.Entry<String, String[]> entry : attributes.entrySet()) {
            System.out.printf("%s=%s \n", entry.getKey(), Arrays.toString(entry.getValue()));
        }
    }

}
