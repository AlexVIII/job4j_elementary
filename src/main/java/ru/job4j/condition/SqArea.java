package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        int p = 10;
        int k = 2;
        double result1 = SqArea.square(p, k);
        System.out.println("Прямоугольник");
        System.out.println("Периметр = " + p + ", Коэффициент = " + k + ", Площадь = " + result1);
    }
}