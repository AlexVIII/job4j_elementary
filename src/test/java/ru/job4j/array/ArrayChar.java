package ru.job4j.array;

public class ArrayChar {
    public  static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int data = word.length;
        if (word.length > pref.length) {
            data = pref.length;
        }
        for (int index = 0; index < data; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}