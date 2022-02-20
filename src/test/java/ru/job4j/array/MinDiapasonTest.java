package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class MinDiapasonTest {
    @Test
    public void whenFistMin() {
        int[] array = new int[] {1, 0, 3, 5, 13, 4, 2};
        int start = 1;
        int finish = 4;
        int rsl = MinDiapason.findMin(array, start, finish);
        int exp = 0;
        Assert.assertEquals(rsl, exp);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {1, 0, 3, 5, 13, 4, 2};
        int start = 2;
        int finish = 4;
        int rsl = MinDiapason.findMin(array, start, finish);
        int exp = 3;
        Assert.assertEquals(rsl, exp);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {1, 0, 7, 5, 3, 4, 9};
        int start = 2;
        int finish = 6;
        int rsl = MinDiapason.findMin(array, start, finish);
        int exp = 3;
        Assert.assertEquals(rsl, exp);
    }
}