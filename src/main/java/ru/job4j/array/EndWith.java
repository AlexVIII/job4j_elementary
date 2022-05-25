package ru.job4j.array;

public class EndWith {
    public static boolean endWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (word[word.length - 1 - index] != pref[pref.length - 1 - index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
