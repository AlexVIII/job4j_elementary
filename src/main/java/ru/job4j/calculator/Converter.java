package ru.job4j.calculator;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float inDollar = 120;
        float expected = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expected == outEuro;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expected == outDollar;
        System.out.println(inEuro + " rubles are " + outEuro + " (Test result - " + passedEuro + ")");
        System.out.println(inDollar + " rubles are " + outDollar + " (Test result - " + passedDollar + ")");
    }
}
