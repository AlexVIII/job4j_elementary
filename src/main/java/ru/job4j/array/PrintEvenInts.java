package ru.job4j.array;

public class PrintEvenInts {
    public static String printEvenInts(int[] numbers) {
       String ln = System.lineSeparator();
       String res = "Numbers from last: " + ln;
       for (int i = 0; i < numbers.length; i++) {
            if ((numbers.length - 1 - i) % 2 == 0) {
                res += numbers[numbers.length - 1 - i] + ln;
            }
        }
        return res;
    }
}