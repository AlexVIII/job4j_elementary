package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class DivideBySixTest {

    @Test
    public void whenNumberDivideBy6() {
        int in = 24;
        String result = DivideBySix.checkNumber(in);
        String expected = "Исходное число делится на 6";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberDivideBy3Not2() {
        int in = 15;
        String result = DivideBySix.checkNumber(in);
        String expected = "Исходное число делится на 3, но является нечетным";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberDivideBy2Not3() {
        int in = 14;
        String result = DivideBySix.checkNumber(in);
        String expected = "Исходное число не делится на 3, является четным";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNotDivideBy2And3() {
        int in = 13;
        String result = DivideBySix.checkNumber(in);
        String expected = "Исходное число не делится на 3, является нечетным";
        Assert.assertEquals(expected, result);
    }

}