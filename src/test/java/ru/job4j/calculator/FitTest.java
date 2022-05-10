package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void when180ManThanWeight92() {
        short in;
        double expected, out;
        in = 180;
        expected = 92;
        out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when174WomanThanWeight73dot6() {
        short in;
        double expected, out;
        in = 174;
        expected = 73.6;
        out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

}