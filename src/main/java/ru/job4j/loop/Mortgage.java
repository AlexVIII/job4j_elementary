package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double persent) {
        int year = 0;
        while (amount > 0) {
            year = year + 1;
            amount = amount * persent / 100 + amount - salary;

        }
        return year;
    }
}