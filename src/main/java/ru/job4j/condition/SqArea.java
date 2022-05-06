package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        return Math.pow(p / (2 * (k + 1)),2) * k;
    }

    public static void main(String[] args) {
        int p, k;
        p = 10;
        k = 2;
        double result1 = SqArea.square(p, k);
        System.out.println("Прямоугольник");
        System.out.println("Периметр = " + p + ", Коэффициент = " + k + ", Площадь = " + result1);
    }
}