package org.rkbung.work;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> getList() {
        List<String> result = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            result.add(String.valueOf(i));
        }
        return result;
    }
}
