package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140rubleToEuro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
     Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert150rubleToDollar() {
        float in = 150;
        float expected = 2.5F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}