package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] dogs = new int[5];
        for (int index = 0; index < 5; index++) {
            dogs[index] = index * 2 + 3;                             
        }
        for (int index = 0; index < 5; index++) {
            System.out.println(dogs[index]);
        }
    }
}