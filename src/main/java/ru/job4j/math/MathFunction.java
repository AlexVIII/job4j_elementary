package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class MathFunction {

    public static double diff(double first, double second) {
        return first - second;
    }

    public static double div(double first, double second) {
        return first / second;
    }

    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }
}