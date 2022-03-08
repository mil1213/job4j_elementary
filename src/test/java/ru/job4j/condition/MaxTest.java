package ru.job4j.condition;

import org.junit.Test;
import  org.junit.Assert;

public class MaxTest {
    @Test
    public void whenMax2To5To8Then8() {
        int first = 2;
        int second = 5;
        int third = 8;
        int exp = 8;
        int result = Max.max(first, second, third);
        Assert.assertEquals(result, exp);
    }

    @Test
    public void whenMax2To5To4Then5() {
        int first = 2;
        int second = 5;
        int third = 4;
        int exp = 5;
        int result = Max.max(first, second, third);
        Assert.assertEquals(result, exp);
    }

    @Test
    public void whenMax4To2To1To6Then6() {
        int first = 4;
        int second = 2;
        int third = 1;
        int forth = 6;
        int exp = 6;
        int result = Max.max(first, second, third, forth);
        Assert.assertEquals(result, exp);
    }

    @Test
    public void whenMax9To2To1To6Then9() {
        int first = 9;
        int second = 2;
        int third = 1;
        int forth = 6;
        int exp = 9;
        int result = Max.max(first, second, third, forth);
        Assert.assertEquals(result, exp);
    }
}