package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert420RblThen6Euro() {
        float in = 420;
        float exp = 6;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(exp, out, eps);
    }

    @Test
    public void whenConvert200RblThen3dot3333Dollar() {
       float in = 200;
       float exp = 3.3333f;
       float out = Converter.rubleToDollar(in);
       float eps = 0.0001f;
       Assert.assertEquals(exp, out, eps);
    }

    @Test
    public void whenConvert4EuroThen280Ruble() {
        float in = 4;
        float exp = 280;
        float out = Converter.euroToRuble(in);
        float eps = 0.0001f;
        Assert.assertEquals(exp, out, eps);
    }

    @Test
    public void whenConvert4DollarThen240Ruble() {
        float in = 4;
        float exp = 240;
        float out = Converter.dollarToRuble(in);
        float eps = 0.0001f;
        Assert.assertEquals(exp, out, eps);
    }
}