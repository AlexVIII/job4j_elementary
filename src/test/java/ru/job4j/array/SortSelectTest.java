package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SortSelectTest {

    @Test
    public void whenSortArray6() {
        int[] data = {4, 3, 5, 6, 2, 1};
        int[] result = SortSelect.sort(data);
        int[] expected = {1, 2, 3, 4, 5, 6};
        Assert.assertArrayEquals(expected, result);
    }
}