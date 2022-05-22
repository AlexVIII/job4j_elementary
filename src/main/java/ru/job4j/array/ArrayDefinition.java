package ru.job4j.array;

import java.rmi.AlreadyBoundException;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[5];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Ages:" + ages.length);
        System.out.println("Surnames: " + surnames.length);
        System.out.println("Prices: " + prices.length);
        String[] names = new String[4];
        names[0] = "Alex";
        names[1] = "Bob";
        names[2] = "Elena";
        String name = names[0];
        System.out.println(name);

    }
}
