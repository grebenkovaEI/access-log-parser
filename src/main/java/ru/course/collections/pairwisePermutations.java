package ru.course.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pairwisePermutations {
    public static void main(String[] args) {
        int N = 8;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        System.out.println("До перестановки: " + list);
        for (int i = 0; i < N; i += 2) {
            Collections.swap(list, i, i + 1);
        }
        System.out.println("После перестановки: " + list);
    }
}
