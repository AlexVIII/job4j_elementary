package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSumTest {

    @Test
    public void whenTwo() {
        int[][] array = {
                {2, 2},
                {2, 2}
        };
        int result = MatrixSum.sum(array);
        int expected = 8;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThree() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int result = MatrixSum.sum(array);
        int expected = 21;
        Assert.assertEquals(expected, result);
    }
}
