package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void when180ManThanWeight92() {
        in = 180;
        expected = 92;
        out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when170WomanThaWeight60() {
        in = 170;
        expected = 69;
        out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    short in;
    double expected, out;
}