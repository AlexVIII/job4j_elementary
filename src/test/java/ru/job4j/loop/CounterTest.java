package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sumByEventFrom1To2Then2() {
        int start = 1;
        int finish = 2;
        int result = Counter.sumByEvent(start, finish);
        int expented = 2;
        Assert.assertEquals(expented, result);
    }

    @Test
    public void sumByEventFrom5To10Then24() {
        int start = 5;
        int finish = 10;
        int result = Counter.sumByEvent(start, finish);
        int expented = 24;
        Assert.assertEquals(expented, result);
    }

    @Test
    public void sumByEventFrom1To1Then0() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEvent(start, finish);
        int expented = 0;
        Assert.assertEquals(expented, result);
    }
}