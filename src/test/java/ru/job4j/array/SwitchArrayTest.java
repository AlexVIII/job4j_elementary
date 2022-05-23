package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SwitchArrayTest {

    @Test
    public void whenSwap1To4() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6};
        int source = 1;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 5, 3, 4, 2, 6};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }
}