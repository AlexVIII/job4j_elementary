package ru.job4j.loop;

import org.junit.Test;

import org.junit.Assert;

public class FitnessTest {

    @Test
    public void whenIvan1Nik5Then4() {
        int ivan = 1;
        int nik = 5;
        int result = Fitness.calc(ivan, nik);
        int expented = 4;
        Assert.assertEquals(expented, result);
    }

    @Test
    public void whenIvan10Nik25Then3() {
        int ivan = 10;
        int nik = 25;
        int result = Fitness.calc(ivan, nik);
        int expented = 3;
        Assert.assertEquals(expented, result);
    }
}