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
}