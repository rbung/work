package org.rkbung.work;

import org.junit.Test;

import java.util.List;

/**
 * User: rkbung
 * Date: 11/08/12
 * Time: 19:35
 */
public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testGetList() throws Exception {
        final List<String> list = fizzBuzz.getList();
        System.out.println(list);
    }
}
