package ru.job4j.loop;

public class Factorial {
    public static int factorialNumbers(int first, int second) {
        int total = 1;
        for (int i =first; i <= second; i++) {
        total = total * i;
        }
        return total;
    }
}
