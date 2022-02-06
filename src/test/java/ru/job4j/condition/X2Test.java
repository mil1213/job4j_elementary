package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int exp = 3;
        int out = X2.calc(a, b, c, x);
        Assert.assertEquals(exp, out);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int exp = 2;
        int out = X2.calc(a, b, c, x);
        Assert.assertEquals(exp, out);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int exp = 2;
        int out = X2.calc(a, b, c, x);
        Assert.assertEquals(exp, out);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int exp = 1;
        int out = X2.calc(a, b, c, x);
        Assert.assertEquals(exp, out);
    }
}