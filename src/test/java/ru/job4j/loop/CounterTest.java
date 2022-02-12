package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class CounterTest {
    @Test
    public void whenSumEvenFromTwoToTwelveThenFortyTwo() {
        int start = 2;
        int finish = 12;
        int exp = 42;
        int rsl = Counter.sumByEven(start, finish);
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void whenSumEvenFromSixToTwentyThen104() {
        int start = 6;
        int finish = 20;
        int exp = 104;
        int rsl = Counter.sumByEven(start, finish);
        Assert.assertEquals(exp, rsl);
    }
}