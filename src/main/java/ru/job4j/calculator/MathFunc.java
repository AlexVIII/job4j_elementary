package ru.job4j.calculator;

public class MathFunc {

    public static int func1(int x) {
        int y;
        y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y;
        y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
       int result1 = MathFunc.func1(100);
       int result2 = MathFunc.func2(5);
       int result3 = result1 + result2;
        System.out.println("Ответ: result = " + result3 );

    }
}