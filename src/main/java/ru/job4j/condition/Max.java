package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int leftLeft) {
        int temp = max(left, leftLeft);
        return max(right, temp);
    }

    public static int max(int left, int leftLeft, int right, int rightRight) {
        int temp = max(left, leftLeft);
        return max(max(rightRight, temp), right);
    }

    public static void main(String[] args) {
           }
}

//1. В классе ru.job4j.condition.Max из задания
// 4.2. Максимум из двух чисел добавить перегруженный метод max для трех и четырех чисел. Постарайтесь, аналогично,
// примеру из задания переиспользовать уже существующие методы.
//public double add(double first, double second, double third) {
//    double tmp = add(second, third);
//    return add(first, tmp);
//}