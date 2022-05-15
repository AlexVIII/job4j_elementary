package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPozitive(int num) {
        return num > 0;
    }

    public static boolean isNotEven(int num) {
        return !isEven(num);
    }

    public static boolean isNotPozitive(int num) {
        return !isPozitive(num);
    }

    public static boolean notEvenAndPozitive(int num) {
        return !isEven(num) && isPozitive(num);
    }

    public static boolean evenOrNotPozitive(int num) {
        return isEven(num) || !isPozitive(num);
    }
}