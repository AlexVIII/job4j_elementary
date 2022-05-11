package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double diffPlusDiv(double first, double second) {
        return diff(first, second) + div(first, second);
    }

    public  static double sumPlusMultiplyPlusDiffPlusDiv(double first, double second) {
        return diffPlusDiv(first, second) + multiply(first, second) + sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Резуьтат расчета четырех операций  = " + sumPlusMultiplyPlusDiffPlusDiv(100, 20));
    }
}
