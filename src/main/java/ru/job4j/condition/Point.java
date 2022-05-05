package ru.job4j.condition;

//Math.sqrt(a) - корень квадратный от a.
//Math.pow(a, b) - возведение числа а в степень b.
//Ниже приведен код, который производит возведение переменной x в квадрат и записывает результат вычисления в переменную first.
//double first = Math.pow(x, 2);
//1. Вычесть аргументы x2 и x1.
//2. Вычесть аргументы y2 и y1.
//3. Возвести в степень 2 результат операции 1.
//4. Возвести в степень 2 результат операции 2.
//5. Сложить результаты операций 3 и 4.
//6. Вычислить корень квадратный из результата операции 5.



public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
       return  Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
          }

    public static void main(String[] args) {
        int x1, x2, y1, y2;
        x1 = 10;
        x2 = 3;
        y1 = 4;
        y2 = 10;
        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("result (" + x1 + "," + y1 + ") to (" + x2 + ","+ y2 + ") " + result);
    }
}