package ru.job4j.loop;

import org.junit.Test;

import org.junit.Assert;

public class FactorialTest {

    @Test
    public void factorialNumber3Then6() {
        int in = 3;
        int result = Factorial.fact(in);
        int expented = 6;
        Assert.assertEquals(expented, result);
    }

    @Test
    public void factorialNumber5Then120() {
        int in = 5;
        int result = Factorial.fact(in);
        int expented = 120;
        Assert.assertEquals(expented, result);
    }

    @Test
    public void factorialNumber7Then120() {
        int in = 7;
        int result = Factorial.fact(in);
        int expented = 5040;
        Assert.assertEquals(expented, result);
    }
}