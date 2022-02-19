package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class EqLastTest {
    @Test
    public void whenEq() {
        int[] left = {1, 2, 3, 4};
        int[] right = {5, 3, 4};
        boolean rsl = EqLast.check(left, right);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3, 4};
        int[] right = {5, 3, 6};
        boolean rsl = EqLast.check(left, right);
        Assert.assertFalse(rsl);
    }
}