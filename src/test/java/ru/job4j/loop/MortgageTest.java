package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class MortgageTest {
    @Test
    public void when1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 1;
        int rsl = Mortgage.year(amount, salary, percent);
        int exp = 1;
        Assert.assertEquals(rsl, exp);
    }

    @Test
    public void when2() {
        int amount = 100;
        int salary = 120;
        double percent = 50;
        int rsl = Mortgage.year(amount, salary, percent);
        int exp = 2;
        Assert.assertEquals(rsl, exp);
    }
}
