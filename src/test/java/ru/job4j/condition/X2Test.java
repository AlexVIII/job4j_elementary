package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class X2Test {

    @Test
    public void whenA1B1C1X1ThenRsl3() {
        int a, b, c, x, expected, rsl;
        a = 1;
        b = 1;
        c = 1;
        x = 1;
        expected = 3;
        rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA0B1C1X1ThenRsl2() {
        int a, b, c, x, expected, rsl;
        a = 0;
        b = 1;
        c = 1;
        x = 1;
        expected = 2;
        rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C0X1ThenRsl2() {
        int a, b, c, x, expected, rsl;
        a = 1;
        b = 1;
        c = 0;
        x = 1;
        expected = 2;
        rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X0ThenRsl1() {
        int a, b, c, x, expected, rsl;
        a = 1;
        b = 1;
        c = 1;
        x = 0;
        expected = 1;
        rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
}