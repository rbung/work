package org.rkbung.work.services.fizzbuzz;

import org.junit.Test;
import org.rkbung.work.services.fizzbuzz.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * User: rkbung
 * Date: 11/08/12
 * Time: 19:35
 */
public class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testGetList_100() throws Exception {
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("1");
        expectedResult.add("2");
        expectedResult.add("Fizz");
        expectedResult.add("4");
        expectedResult.add("Buzz");
        expectedResult.add("Fizz");
        expectedResult.add("7");
        expectedResult.add("8");
        expectedResult.add("Fizz");
        expectedResult.add("Buzz");
        expectedResult.add("11");
        expectedResult.add("Fizz");
        expectedResult.add("13");
        expectedResult.add("14");
        expectedResult.add("FizzBuzz");
        expectedResult.add("16");
        expectedResult.add("17");
        expectedResult.add("Fizz");
        expectedResult.add("19");
        expectedResult.add("Buzz");
        expectedResult.add("Fizz");
        expectedResult.add("22");
        expectedResult.add("23");
        expectedResult.add("Fizz");
        expectedResult.add("Buzz");
        expectedResult.add("26");
        expectedResult.add("Fizz");
        expectedResult.add("28");
        expectedResult.add("29");
        expectedResult.add("FizzBuzz");
        expectedResult.add("31");
        expectedResult.add("32");
        expectedResult.add("Fizz");
        expectedResult.add("34");
        expectedResult.add("Buzz");
        expectedResult.add("Fizz");
        expectedResult.add("37");
        expectedResult.add("38");
        expectedResult.add("Fizz");
        expectedResult.add("Buzz");
        expectedResult.add("41");
        expectedResult.add("Fizz");
        expectedResult.add("43");
        expectedResult.add("44");
        expectedResult.add("FizzBuzz");
        expectedResult.add("46");
        expectedResult.add("47");
        expectedResult.add("Fizz");
        expectedResult.add("49");
        expectedResult.add("Buzz");
        expectedResult.add("Fizz");
        expectedResult.add("52");
        expectedResult.add("53");
        expectedResult.add("Fizz");
        expectedResult.add("Buzz");
        expectedResult.add("56");
        expectedResult.add("Fizz");
        expectedResult.add("58");
        expectedResult.add("59");
        expectedResult.add("FizzBuzz");
        expectedResult.add("61");
        expectedResult.add("62");
        expectedResult.add("Fizz");
        expectedResult.add("64");
        expectedResult.add("Buzz");
        expectedResult.add("Fizz");
        expectedResult.add("67");
        expectedResult.add("68");
        expectedResult.add("Fizz");
        expectedResult.add("Buzz");
        expectedResult.add("71");
        expectedResult.add("Fizz");
        expectedResult.add("73");
        expectedResult.add("74");
        expectedResult.add("FizzBuzz");
        expectedResult.add("76");
        expectedResult.add("77");
        expectedResult.add("Fizz");
        expectedResult.add("79");
        expectedResult.add("Buzz");
        expectedResult.add("Fizz");
        expectedResult.add("82");
        expectedResult.add("83");
        expectedResult.add("Fizz");
        expectedResult.add("Buzz");
        expectedResult.add("86");
        expectedResult.add("Fizz");
        expectedResult.add("88");
        expectedResult.add("89");
        expectedResult.add("FizzBuzz");
        expectedResult.add("91");
        expectedResult.add("92");
        expectedResult.add("Fizz");
        expectedResult.add("94");
        expectedResult.add("Buzz");
        expectedResult.add("Fizz");
        expectedResult.add("97");
        expectedResult.add("98");
        expectedResult.add("Fizz");
        expectedResult.add("Buzz");
        final List<String> list = fizzBuzz.getList(100);
        assertThat(list, is(notNullValue()));
        assertThat(list.size(), is(100));
        assertThat(list, is(expectedResult));
    }

    @Test
    public void testGetList_23() throws Exception {
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("1");
        expectedResult.add("2");
        expectedResult.add("Fizz");
        expectedResult.add("4");
        expectedResult.add("Buzz");
        expectedResult.add("Fizz");
        expectedResult.add("7");
        expectedResult.add("8");
        expectedResult.add("Fizz");
        expectedResult.add("Buzz");
        expectedResult.add("11");
        expectedResult.add("Fizz");
        expectedResult.add("13");
        expectedResult.add("14");
        expectedResult.add("FizzBuzz");
        expectedResult.add("16");
        expectedResult.add("17");
        expectedResult.add("Fizz");
        expectedResult.add("19");
        expectedResult.add("Buzz");
        expectedResult.add("Fizz");
        expectedResult.add("22");
        expectedResult.add("23");
        final List<String> list = fizzBuzz.getList(23);
        assertThat(list, is(notNullValue()));
        assertThat(list.size(), is(23));
        assertThat(list, is(expectedResult));
    }

    @Test
    public void testGetList_0() throws Exception {
        List<String> expectedResult = new ArrayList<>();
        final List<String> list = fizzBuzz.getList(0);
        assertThat(list, is(notNullValue()));
        assertThat(list.size(), is(0));
        assertThat(list, is(expectedResult));
    }

}
