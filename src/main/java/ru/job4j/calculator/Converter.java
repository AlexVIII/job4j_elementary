package ru.job4j.calculator;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float cash = 140;
        float cashEuro = 2;
        float euro = Converter.rubleToEuro(cash);
        boolean result = cashEuro == euro;
        float dollar = Converter.rubleToDollar(cash);
        System.out.println(cash + " rubles are " + euro + " (Test result - " + result + ")");
        System.out.println(cash + " rubles are " + dollar + " (Test result - " + result + ")");
    }
}
