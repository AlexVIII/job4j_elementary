package ru.job4j.loop;

import org.junit.Test;

import org.junit.Assert;



public class FactorialTest {

    @Test
    public void factorialNumbersFrom1To3Then6() {
        int start = 1;
        int finish = 3;
        int result = Factorial.factorialNumbers(start, finish);
        int expented = 6;
        Assert.assertEquals(expented, result);
    }

    @Test
    public void factorialNumbersFrom5To8Then1680() {
        int start = 5;
        int finish = 8;
        int result = Factorial.factorialNumbers(start, finish);
        int expented = 1680;
        Assert.assertEquals(expented, result);
    }
}