package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class MatrixSumTest {
    @Test
    public void whenSingle() {
       int[][] array = {
               {10}
       };
       int rst = MatrixSum.sum(array);
       int exp = 10;
       Assert.assertEquals(rst, exp);
    }

    @Test
    public void whenThreeByTwo() {
        int[][] array = {
                {2, 3},
                {3, 2},
                {1, 4}
        };
        int rst = MatrixSum.sum(array);
        int exp = 15;
        Assert.assertEquals(rst, exp);
    }

    @Test
    public void whenThreeByDif() {
        int[][] array = {
                {2},
                {3, 2},
                {1, 4, 1}
        };
        int rst = MatrixSum.sum(array);
        int exp = 13;
        Assert.assertEquals(rst, exp);
    }
}