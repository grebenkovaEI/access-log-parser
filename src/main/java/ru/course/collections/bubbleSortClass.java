package ru.course.collections;

import java.util.ArrayList;

public class bubbleSortClass {
    public static void bubbleSort(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int temp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, temp);
                }
            }
        }
    }

    public static void bubbleSort(int[] intArray) {
        // Реализовать сортировку для массива
        int length = intArray.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                        int temp = intArray[j];
                        intArray[j] = intArray[j + 1];
                        intArray[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 1, 7, 5, 9};
        System.out.println("До сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i == array.length - 1 ? "" : ", "));
        }
        System.out.println();
        bubbleSort(array);
        System.out.println("После сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i == array.length - 1 ? "" : ", "));
        }
    }
}
