package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class MachineTest {
    @Test
    public void whenEquals() {
        int money = 100;
        int price = 100;
        int[] rst = Machine.change(money, price);
        int[] exp = {};
        Assert.assertArrayEquals(exp, rst);
    }

    @Test
    public void when50By21() {
        int money = 50;
        int price = 21;
        int[] rst = Machine.change(money, price);
        int[] exp = {10, 10, 5, 2, 2};
        Assert.assertArrayEquals(exp, rst);
    }

    @Test
    public void when50By32() {
        int money = 50;
        int price = 32;
        int[] rst = Machine.change(money, price);
        int[] exp = {10, 5, 2, 1};
        Assert.assertArrayEquals(exp, rst);
    }
}