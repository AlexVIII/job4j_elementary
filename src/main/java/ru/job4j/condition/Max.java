package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int leftLeft) {
        return max(right, max(left, leftLeft));
    }

    public static int max(int left, int leftLeft, int right, int rightRight) {
          return max(max(rightRight, max(left, leftLeft)), right);
    }

}