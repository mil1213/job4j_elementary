package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class MatrixTest {
    @Test
    public void when2on2() {
        int size = 2;
        int[][] rst = Matrix.multiple(size);
        int[][] exp = {
                {1, 2},
                {2, 4}
        };
        Assert.assertArrayEquals(exp, rst);
    }

    @Test
    public void when4on4() {
        int size = 5;
        int[][] rst = Matrix.multiple(size);
        int[][] exp = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };
        Assert.assertArrayEquals(exp, rst);
    }
}