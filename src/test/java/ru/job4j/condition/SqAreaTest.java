package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double p, k, expected, out;
        expected = 2;
        p = 6;
        k = 2;
        out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K4Square1dot44() {
        double p, k, expected, out;
        expected = 1.44;
        p = 6;
        k = 4;
        out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP72K1Square3dot24() {
        double p, k, expected, out;
        expected = 3.24;
        p = 7.2;
        k = 1;
        out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}