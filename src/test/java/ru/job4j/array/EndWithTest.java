package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class EndWithTest {

    @Test
    public void endWithWords() {
        char[] pref = {'l', 'o'};
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        boolean result = EndWith.endWith(word, pref);
        Assert.assertTrue(result);
    }

    @Test
    public void endWithNoWords() {
        char[] pref = {'m', 'l', 'o'};
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        boolean result = EndWith.endWith(word, pref);
        Assert.assertFalse(result);
    }
}