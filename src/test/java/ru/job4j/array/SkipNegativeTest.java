package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

import java.awt.*;

public class SkipNegativeTest {

    @Test
    public void whenRowAndCollumsEquals() {
        int[][] array = {
                {1, 2, 3},
                {4, -5, 9}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 2, 3},
                {4, 0, 9}
        };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenRowAndColumnsNotEquail() {
        int[][] array = {
            {1, 2, 3},
            {-5, 2, -4, -1},
            {-4, 1},
            {-1},
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 2, 3},
                {0, 2, 0, 0},
                {0, 1},
                {0}
        };
        Assert.assertArrayEquals(expected, result);
    }
}