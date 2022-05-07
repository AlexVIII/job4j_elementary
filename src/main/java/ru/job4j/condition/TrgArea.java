package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double a, b, c;
        a = 2.5;
        b = 2;
        c = 2;
        double rsl = TrgArea.area(a, b, c);
        System.out.println("Площадь треугольника (" + a + ", " + b + ", " + c + ") = " + rsl);
    }
}