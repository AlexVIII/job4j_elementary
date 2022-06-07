package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenX0Y1X3Y5then5() {
       Point a = new Point(0, 1);
       Point b = new Point(3, 5);
        double out = a.distance(b);
        double expected = 5;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX6Y4X2Y1then5() {
        Point a = new Point(6, 4);
        Point b = new Point(2, 1);
        double expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX3Y2X4Y2then1() {
        Point a = new Point(3, 2);
        Point b = new Point(4, 2);
        double expected = 1;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}
