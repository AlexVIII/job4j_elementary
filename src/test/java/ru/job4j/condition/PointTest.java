package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenX0Y1X3Y5then5() {
        int x1, x2, y1, y2;
        double expected, out;
        x1 = 0;
        y1 = 1;
        x2 = 3;
        y2 = 5;
        expected = 5;
        out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX6Y4X2Y1then5() {
        int x1, x2, y1, y2;
        double expected, out;
        x1 = 6;
        y1 = 4;
        x2 = 2;
        y2 = 1;
        expected = 5;
        out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX3Y2X4Y2then1() {
        int x1, x2, y1, y2;
        double expected, out;
        x1 = 3;
        y1 = 2;
        x2 = 4;
        y2 = 2;
        expected = 1;
        out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}
