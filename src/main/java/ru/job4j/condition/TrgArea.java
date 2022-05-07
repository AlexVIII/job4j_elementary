package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double abc2 = (a + b + c) / 2;
        return Math.sqrt(abc2 * (abc2 - a) * (abc2 - b) * (abc2 - c));
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