package ru.job4j.array;

public class SortSelect {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min =  MinDiaposon.findMinni(array, i, array.length - 1);
            int index = FindLoop.indexIndexRange(array, min, i, array.length - 1);
            SwitchArray.swap(array, i, index);
        }
        return array;
    }
}
