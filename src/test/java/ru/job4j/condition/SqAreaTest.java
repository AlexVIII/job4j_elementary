package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        expected = 2;
        p = 6;
        k = 2;
        out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    double p, k, expected, out;

}