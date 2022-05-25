package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinDiaposonTest {

    @Test
    public void whenDiaposonFrom1To5Mini4() {
        int[] data = {0, 4, 5, 8, 3, 9, 11};
        int start = 1;
        int finish = 5;
        int result = MinDiaposon.findMinni(data, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFirstMini() {
        int[] data = {1, 2, 3, 9, 5};
        int start = 0;
        int finish = 4;
        int result = MinDiaposon.findMinni(data, start, finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFinishMini() {
        int[] data = {9, 5, 4, 2, 3, 1};
        int start = 1;
        int finish = 5;
        int result = MinDiaposon.findMinni(data, start, finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}