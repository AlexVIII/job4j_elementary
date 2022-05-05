package ru.job4j.condition;

//h = p / (2 * (k + 1));
//
//l = h * k;
//
//s = l * h;
//
//В задаче известны переменные p и k, теперь ваша задача записать эти уравнения в коде программы.

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