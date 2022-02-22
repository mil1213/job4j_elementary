package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class MatrixCheckTest {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'x', 'x', 'x'},
                {' ', ' ', ' '}
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotHasMonoHorizontalX() {
        char[][] input = {
                {' ', ' ', ' '},
                {'y', 'y', 'y'},
                {' ', ' ', ' '}
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertFalse(result);
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'x'},
                {' ', ' ', 'x'},
                {' ', ' ', 'x'}
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'x'},
                {' ', ' ', 'x'},
                {' ', ' ', 'x'}
        };
        int column = 1;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertFalse(result);
    }

    @Test
    public void whenDiagonalFullX() {
        char[][] input = {
                {'x', ' ', ' '},
                {' ', 'x', ' '},
                {' ', ' ', 'x'}
        };
        char[] exp = {'x', 'x', 'x'};
        char[] result = MatrixCheck.extractDiagonal(input);
        Assert.assertArrayEquals(exp, result);
    }

    @Test
    public void whenDiagonalFull2() {
        char[][] input = {
                {'2', ' ', ' '},
                {' ', '2', ' '},
                {' ', ' ', '2'}
        };
        char[] exp = {'2', '2', '2'};
        char[] result = MatrixCheck.extractDiagonal(input);
        Assert.assertArrayEquals(exp, result);
    }

    @Test
    public void whenDiagonalFullMix() {
        char[][] input = {
                {'a', ' ', ' '},
                {' ', 'b', ' '},
                {' ', ' ', 'c'}
        };
        char[] exp = {'a', 'b', 'c'};
        char[] result = MatrixCheck.extractDiagonal(input);
        Assert.assertArrayEquals(exp, result);
    }
}