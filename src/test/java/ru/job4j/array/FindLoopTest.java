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

    @Test
    public void whenFind3() {
        int[] data = new int[] {7, 5, 9, 0, 8};
        int el = 0;
        int start = 2;
        int finish = 4;
        int rsl = FindLoop.indexOf(data, el, start, finish);
        int exp = 3;
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void whenNotFind4() {
        int[] data = new int[] {7, 5, 9, 0, 8};
        int el = 8;
        int start = 1;
        int finish = 3;
        int rsl = FindLoop.indexOf(data, el, start, finish);
        int exp = -1;
        Assert.assertEquals(exp, rsl);
    }
}