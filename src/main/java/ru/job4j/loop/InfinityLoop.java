package ru.job4j.loop;

public class InfinityLoop {
        public static void main(String[] args) {
            for (int index = 0; index < 3; index++) {
                System.out.println("infinity");
                index = index - 1;
            }
        }
    }
