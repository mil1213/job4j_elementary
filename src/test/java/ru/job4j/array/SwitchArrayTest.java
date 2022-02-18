package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] exp = {4, 2, 3, 1};
        Assert.assertArrayEquals(result, exp);
    }

    @Test
    public void whenSwap2to4() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 2;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] exp = {1, 2, 5, 4, 3, 6};
        Assert.assertArrayEquals(result, exp);
    }

    @Test
    public void whenSwap1toMinus2() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 1;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] exp = {1, 5, 3, 4, 2, 6};
        Assert.assertArrayEquals(result, exp);
    }

}