package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan210Then126dot5() {
        short in = 210;
        double exp = 126.5;
        double out = Fit.manWeight(in);
        Assert.assertEquals(exp, out, 0.01);
    }

    @Test
    public void whenWoman175Then74dot75() {
        short in = 175;
        double exp = 74.75;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(exp, out, 0.01);
    }

}