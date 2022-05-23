package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class PremierNumberTest {

    @Test
    public void when5ThenCountSimple3() {
        int in = 5;
        int result = PremierNumber.calc(in);
        int expented = 3;
        Assert.assertEquals(expented, result);
    }

    @Test
    public void when2ThenCountSimple1() {
        int in = 2;
        int result = PremierNumber.calc(in);
        int expented = 1;
        Assert.assertEquals(expented, result);
    }

    @Test
    public void when11ThenCountSimple5() {
        int in = 11;
        int result = PremierNumber.calc(in);
        int expented = 5;
        Assert.assertEquals(expented, result);
    }
}