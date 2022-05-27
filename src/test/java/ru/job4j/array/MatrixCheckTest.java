package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] array = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {'X', 'X', ' '}
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(array, row);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasNotMonoHorizontal() {
        char[][] array = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {'X', 'X', ' '}
        };
        int row = 0;
        boolean result = MatrixCheck.monoHorizontal(array, row);
        Assert.assertFalse(result);
    }

    @Test
    public void whenHasNoMonoHorizontal() {
        char[][] array = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {'X', 'X', ' '}
        };
        int row = 2;
        boolean result = MatrixCheck.monoHorizontal(array, row);
        Assert.assertFalse(result);
    }

    @Test
    public void whenHasNotMonoVertical() {
        char[][] array = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {'X', 'X', 'X'}
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(array, column);
        Assert.assertFalse(result);
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] array = {
                {' ', 'X', ' '},
                {'X', 'X', 'X'},
                {'X', 'X', 'X'}
        };
        int column = 1;
        boolean result = MatrixCheck.monoVertical(array, column);
        Assert.assertTrue(result);
    }
}

