package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SquareTest {
    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] rsl = Square.calkulate(bound);
        int[] exp = new int[] {0, 1, 4};
        Assert.assertArrayEquals(rsl, exp);
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] rsl = Square.calkulate(bound);
        int[] exp = new int[] {0, 1, 4, 9, 16};
        Assert.assertArrayEquals(rsl, exp);
    }
}