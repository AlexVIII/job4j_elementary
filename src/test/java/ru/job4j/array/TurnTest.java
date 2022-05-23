package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsFrom1To4ThenTurnedArrayFrom4To1() {
        int[] input = {1, 2, 3, 4};
        int[] result = Turn.back(input);
        int[] expented = {4, 3, 2, 1};
        Assert.assertArrayEquals(expented, result);
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsFrom1To5ThenTurnedArrayFrom5To1() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expented = {5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expented, result);
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsFrom1To8ThenTurnedArrayFrom8To1() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = Turn.back(input);
        int[] expented = {8, 7, 6, 5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expented, result);
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsFrom1To9ThenTurnedArrayFrom9To1() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = Turn.back(input);
        int[] expented = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expented, result);
    }
}