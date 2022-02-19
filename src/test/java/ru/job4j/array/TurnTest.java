package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] rsl = Turn.back(input);
        int[] exp = new int[] {4, 3, 2, 1};
        Assert.assertArrayEquals(exp, rsl);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] rsl = Turn.back(input);
        int[] exp = new int[] {5, 4, 3, 2, 1};
        Assert.assertArrayEquals(exp, rsl);
    }
}