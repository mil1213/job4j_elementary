package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP24K2Square32() {
        double p = 24;
        double k = 2;
        int exp = 32;
        double out = SqArea.square(p, k);
        Assert.assertEquals(exp, out, 0.01);
    }

    @Test
    public void whenP24K5Square20() {
        double p = 24;
        double k = 5;
        int exp = 20;
        double out = SqArea.square(p, k);
        Assert.assertEquals(exp, out, 0.01);
    }

    @Test
    public void whenP40K3Square75() {
        double p = 40;
        double k = 3;
        int exp = 75;
        double out = SqArea.square(p, k);
        Assert.assertEquals(exp, out, 0.01);
    }
}