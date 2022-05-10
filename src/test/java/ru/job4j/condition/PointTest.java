package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenX0Y1X3Y5then5() {
        int x1 = 0;
        int y1 = 1;
        int x2 = 3;
        int y2 = 5;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX6Y4X2Y1then5() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 2;
        int y2 = 1;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX3Y2X4Y2then1() {
        int x1 = 3;
        int y1 = 2;
        int x2 = 4;
        int y2 = 2;
        double expected = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}
