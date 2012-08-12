package org.rkbung.work;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    private static final Logger LOGGER = LoggerFactory.getLogger(FizzBuzz.class);

    public List<String> getList(int numberOfValue) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i < numberOfValue + 1; i++) {
            String value = StringUtils.EMPTY;
            if (i % 3 == 0) {
                value = "Fizz";
            }
            if (i % 5 == 0) {
                value += "Buzz";
            }
            if (StringUtils.isEmpty(value)) {
                value = String.valueOf(i);
            }
            LOGGER.debug("Current integer : {} - Adding {}", i, value);
            result.add(value);
        }
        return result;
    }
}
