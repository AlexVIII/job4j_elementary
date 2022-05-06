package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
       return  Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
          }

    public static void main(String[] args) {
        int x1, x2, y1, y2;
        x1 = 10;
        x2 = 3;
        y1 = 4;
        y2 = 10;
        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("result (" + x1 + "," + y1 + ") to (" + x2 + ","+ y2 + ") " + result);
    }
}