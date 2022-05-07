package ru.job4j.calculator;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int cash = 200;
        float euro = Converter.rubleToEuro(cash);
        float dollar = Converter.rubleToDollar(cash);
        System.out.println(cash + " rubles are " + euro + " euro");
        System.out.println(cash + " rubles are " + dollar + " dollar");
    }
}
