package ru.job4j.array;

public class SwitchArray {
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return  array;
    }
//Вашей задачей является реализовать метод таким образом, чтобы значение ячеек с индексами source и dest поменялись местами. При этом:
//
//- source указывает на индекс элемента, который будет записан в ячейку с индексом dest;
//
//- dest указывает на индекс элемента, который будет записан в ячейку с индексом source;

    public static void main(String[] args) {
        int[] nums = new int[] {10, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(nums[index]);
        }
    }
}