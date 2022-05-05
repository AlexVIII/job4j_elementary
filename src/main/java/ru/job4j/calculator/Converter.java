package ru.job4j.calculator;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 60;
    }

    public static float rubleToDollar(float value) {
        return value / 70;
    }

    public static void main(String[] args) {
        int cash = 200;
        float euro = Converter.rubleToEuro(cash);
        float dollar = Converter.rubleToDollar(cash);
        System.out.println(cash + " rubles are " + euro + " euro");
        System.out.println(cash + " rubles are " + dollar + " dollar");
    }
}

//1. Реализовать метод конвертации рублей в евро и доллары.
//
//Вам нужно заменить -1 на формулу для вычисления валюты.
//
//1 доллар = 60 рублей.
//1 евро = 70 рублей.
//
//Важное примечание: Здесь и далее по курсу в шаблонах могут присутствовать пояснительные комментарии в коде, их следует удалять. Надо запомнить, что комментарии в коде - плохой тон, а для документирования методов используется инструментарий JavaDoc. Он будет изучаться в следующих разделах курса.
//
//2. Доработайте метод main. Добавьте в него примеры выводов всех видов конвертаций.