package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 2, 1, 5, 4};
        int[] rsl = SortSelected.sort(data);
        int[] exp = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(rsl, exp);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {9, 3, 1};
        int[] rsl = SortSelected.sort(data);
        int[] exp = new int[] {1, 3, 9};
        Assert.assertArrayEquals(rsl, exp);
    }
}