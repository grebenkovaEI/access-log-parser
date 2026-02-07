package ru.course.stream.printList;

import java.util.ArrayList;

public class printListClass {
    public static void printList(ArrayList<Integer> list) {
        list.forEach(i -> System.out.println(i));
    }
}
