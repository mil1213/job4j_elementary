package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FitnessTest {
    @Test
    public void whenIvanGreatNik() {
        int ivan = 95;
        int nik = 90;
        int rsl = Fitness.calk(ivan, nik);
        int exp = 0;
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void whenIvanLessByOneNik() {
        int ivan = 90;
        int nik = 95;
        int rsl = Fitness.calk(ivan, nik);
        int exp = 1;
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void whenIvanLessByFewNik() {
        int ivan = 50;
        int nik = 90;
        int rsl = Fitness.calk(ivan, nik);
        int exp = 2;
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void whenIvanEqualsNik() {
        int ivan = 90;
        int nik = 90;
        int rsl = Fitness.calk(ivan, nik);
        int exp = 1;
        Assert.assertEquals(exp, rsl);
    }

}