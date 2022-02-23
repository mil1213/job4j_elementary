package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class DefragmentTest {
    @Test
    public void singleFirstNull() {
        String[] input = {null, "I"};
        String[] rst = Defragment.compress(input);
        String[] exp = {"I", null};
        Assert.assertArrayEquals(exp, rst);
    }

    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] rst = Defragment.compress(input);
        String[] exp = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(exp, rst);
    }

    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] rst = Defragment.compress(input);
        String[] exp = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(exp, rst);
    }

    @Test
    public void allNull() {
        String[] input = {null, null,  null};
        String[] rst = Defragment.compress(input);
        String[] exp = {null, null, null};
        Assert.assertArrayEquals(exp, rst);
    }

    @Test
    public void notAllAtFirstNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] rst = Defragment.compress(input);
        String[] exp = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(exp, rst);
    }

}