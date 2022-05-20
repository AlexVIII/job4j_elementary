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
    public void when100ThenCountSimple26() {
        int in = 100;
        int result = PremierNumber.calc(in);
        int expented = 26;
        Assert.assertEquals(expented, result);
    }

    @Test
    public void when50ThenCountSimple16() {
        int in = 50;
        int result = PremierNumber.calc(in);
        int expented = 16;
        Assert.assertEquals(expented, result);
    }

}