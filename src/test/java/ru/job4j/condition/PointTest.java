package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when34to51Then3dot6() {
        Point c = new Point(3, 4);
        Point d = new Point(5, 1);
        double exp = 3.6;
        double out = c.distance(d);
        Assert.assertEquals(exp, out, 0.1);
    }

    @Test
    public void when21to62Then4dot1() {
        Point c = new Point(2, 1);
        Point d = new Point(6, 2);
        double exp = 4.1;
        double out = c.distance(d);
        Assert.assertEquals(exp, out, 0.1);
    }

    @Test
    public void whenm2m1tom34Then5dot1() {
        Point c = new Point(-2, -1);
        Point d = new Point(-3, 4);
        double exp = 5.1;
        double out = c.distance(d);
        Assert.assertEquals(exp, out, 0.1);
    }

    @Test
    public void when211to321Then1dot4() {
        Point c = new Point(2, 1, 1);
        Point d = new Point(3, 2, 1);
        double exp = 1.4;
        double out = c.distance3D(d);
        Assert.assertEquals(exp, out, 0.1);
    }

    @Test
    public void whenm423tom5m3m3Then7dot9() {
        Point c = new Point(-4, 2, 3);
        Point d = new Point(-5, -3, -3);
        double exp = 7.9;
        double out = c.distance3D(d);
        Assert.assertEquals(exp, out, 0.1);
    }
}