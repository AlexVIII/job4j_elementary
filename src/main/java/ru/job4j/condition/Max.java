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