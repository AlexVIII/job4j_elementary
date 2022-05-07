package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        float cash = 140;
        float euro = 2;
        float cashToEuro = Converter.rubleToEuro(cash);
        float eps = 0.0001f;
     Assert.assertEquals(euro, cashToEuro, eps);
    }

    @Test
    public void rubleToDollar() {
        float cash = 150;
        float dollar = 2.5F;
        float cashToDollar = Converter.rubleToDollar(cash);
        float eps = 0.0001f;
        Assert.assertEquals(dollar, cashToDollar, eps);
    }
}