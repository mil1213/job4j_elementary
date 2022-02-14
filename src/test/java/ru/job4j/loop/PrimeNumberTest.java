package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class PrimeNumberTest {
    @Test
    public void when5() {
        int finish = 5;
        int rsl = PrimeNumber.calk(finish);
        int exp = 3;
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void when11() {
        int finish = 11;
        int rsl = PrimeNumber.calk(finish);
        int exp = 5;
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void when2() {
        int finish = 2;
        int rsl = PrimeNumber.calk(finish);
        int exp = 1;
        Assert.assertEquals(exp, rsl);
    }
}
