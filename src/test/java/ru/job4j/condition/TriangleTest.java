package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {
    @Test
    public void whenExist() {
        double ab = 3;
        double bc = 4;
        double ac = 5;
        boolean out = Triangle.exist(ab, bc, ac);
        Assert.assertTrue(out);
    }

    @Test
    public void whenNotExist() {
        double ab = 13;
        double bc = 4;
        double ac = 5;
        boolean out = Triangle.exist(ab, bc, ac);
        Assert.assertFalse(out);
    }
}