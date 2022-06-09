package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when1And2And3Max3() {
        int left = 1;
        int right = 2;
        int leftLeft = 3;
        int result = Max.max(left, right, leftLeft);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when1And10And3And4Max10() {
        int left = 1;
        int right = 10;
        int leftLeft = 3;
        int rightRight = 4;
        int result = Max.max(left, right, leftLeft, rightRight);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

}