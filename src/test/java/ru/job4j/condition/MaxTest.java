package ru.job4j.condition;

import org.junit.Test;
import  org.junit.Assert;

public class MaxTest {
    @Test
    public void whenMax2To5Then5() {
        int left = 2;
        int right = 5;
        int exp = 5;
        int result = Max.max(left, right);
        Assert.assertEquals(result, exp);
    }

    @Test
    public void whenMax4To2Then4() {
        int left = 4;
        int right = 2;
        int exp = 4;
        int result = Max.max(left, right);
        Assert.assertEquals(result, exp);
    }

    @Test
    public void whenMax7To7Then7() {
        int left = 7;
        int right = 7;
        int exp = 7;
        int result = Max.max(left, right);
        Assert.assertEquals(result, exp);
    }
}