package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class MinTest {

    @Test
    public void whenFirstMini() {
        int[] data = {1, 2, 3};
        int result = Min.findMini(data);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMini() {
        int[] data = {1, 2, 3, 5, 0};
        int result = Min.findMini(data);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMini() {
        int[] data = {5, 4, 8, 3, 9, 7};
        int result = Min.findMini(data);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
}