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

    @Test
    public void whenDiagonalX() {
        char[][] array = {
                {'X', 'j', 'f'},
                {'1', 'X', '2'},
                {'p', 'v', 'X'}
        };
        char[] result = MatrixCheck.extractDiagonal(array);
        char[] expected = {'X', 'X', 'X'};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDiagonal1() {
        char[][] array = {
                {'1', 'j', 'f'},
                {'1', '1', '1'},
                {'p', '1', '1'}
        };
        char[] result = MatrixCheck.extractDiagonal(array);
        char[] expected = {'1', '1', '1'};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDiagonal1X() {
        char[][] array = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.iswin(array);
        Assert.assertTrue(result);
    }

    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.iswin(input);
        Assert.assertTrue(result);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.iswin(input);
        Assert.assertFalse(result);
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.iswin(input);
        Assert.assertTrue(result);
    }

}

