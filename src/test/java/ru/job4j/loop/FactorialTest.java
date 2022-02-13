package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThen120() {
        int in = 5;
        int exp = 120;
        int out = Factorial.calk(in);
        Assert.assertEquals(exp, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThen1() {
        int in = 0;
        int exp = 1;
        int out = Factorial.calk(in);
        Assert.assertEquals(exp, out);
    }
}