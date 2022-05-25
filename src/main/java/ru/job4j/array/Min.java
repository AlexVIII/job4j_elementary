package ru.job4j.array;

public class Min {
    public  static int findMini(int[] array) {
        int min =  array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
