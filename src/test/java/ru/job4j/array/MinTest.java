package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class MinTest {
    @Test
    public void whenFirstMin() {
        int[] array = new int[] {0, 3, 7};
        int rsl = Min.findMin(array);
        int exp = 0;
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void whenLasttMin() {
        int[] array = new int[] {8, 3, 7, 1};
        int rsl = Min.findMin(array);
        int exp = 1;
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {8, 3, 0, 7, 1};
        int rsl = Min.findMin(array);
        int exp = 0;
        Assert.assertEquals(exp, rsl);
    }
}