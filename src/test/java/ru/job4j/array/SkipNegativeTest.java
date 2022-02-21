package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SkipNegativeTest {
    @Test
    public void whenArrayRowAndColumnEqual() {
        int[][] array = {
                {1, -2},
                {0, 2}
        };
        int[][] rst = SkipNegative.skip(array);
        int[][] exp = {
                {1, 0},
                {0, 2}
        };
        Assert.assertArrayEquals(exp, rst);
    }

    @Test
    public void whenArrayRowAndColumnNotEqual() {
        int[][] array = {
                {1, -2},
                {0, 2, -3},
                {1, -4, 5, 6},
                {-2, 3, -4, 5, 6}
        };
        int[][] rst = SkipNegative.skip(array);
        int[][] exp = {
                {1, 0},
                {0, 2, 0},
                {1, 0, 5, 6},
                {0, 3, 0, 5, 6}
        };
        Assert.assertArrayEquals(exp, rst);
    }

}