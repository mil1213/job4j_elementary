package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] data = new boolean[] {true, true, true};
        boolean rsl = Check.mono(data);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = new boolean[] {true, false, true};
        boolean rsl = Check.mono(data);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] data = new boolean[] {false, false, false};
        boolean rsl = Check.mono(data);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenDataNotMonoByFalseThenFalse() {
        boolean[] data = new boolean[] {false, false, true};
        boolean rsl = Check.mono(data);
        Assert.assertFalse(rsl);
    }
}