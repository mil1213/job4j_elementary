package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when34to51Then3dot6() {
        int x1 = 3;
        int y1 = 4;
        int x2 = 5;
        int y2 = 1;
        double exp = 3.6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(exp, out, 0.1);
    }

    @Test
    public void when21to62Then4dot1() {
        int x1 = 2;
        int y1 = 1;
        int x2 = 6;
        int y2 = 2;
        double exp = 4.1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(exp, out, 0.1);
    }

    @Test
    public void whenm36to2mThen11dot18() {
        int x1 = -3;
        int y1 = 6;
        int x2 = 2;
        int y2 = -4;
        double exp = 11.18;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(exp, out, 0.01);
    }
}