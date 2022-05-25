package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int el = 5;
        int[] data = new int[]{5, 4, 3, 2};
        int result = FindLoop.indexOff(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

     @Test
    public void whenArrayHasNot10ThenMinus1() {
        int el = 10;
        int[] data = new int[]{1, 2, 3, 5, 8, 4};
        int result = FindLoop.indexOff(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
     }

    @Test
    public void whenDiapozonHas3Then3() {
        int[] data = {1, 5, 3, 8, 7, 4};
        int start = 2;
        int finish = 5;
        int el = 8;
        int expected = 3;
        int result = FindLoop.indexIndexRange(data, el, start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapozonFrom0To4ThenThen2() {
        int[] data = {1, 8, 4, 9, 5, 0, 7};
        int el = 4;
        int start = 0;
        int finish = 4;
        int result = FindLoop.indexIndexRange(data, el, start, finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}