package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class FindLoopTest {
    @Test
    public void whenArrayHas5then1() {
        int[] data = {2, 5, 6, 19};
        int el = 5;
        int rsl = FindLoop.indexOf(data, el);
        int exp = 1;
        Assert.assertEquals(rsl, exp);
    }

    @Test
    public void whenArrayHasnot7thenMinus1() {
        int[] data = {2, 5, 6, 19};
        int el = 7;
        int rsl = FindLoop.indexOf(data, el);
        int exp = -1;
        Assert.assertEquals(rsl, exp);
    }
}