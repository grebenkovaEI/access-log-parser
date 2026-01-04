package ru.course;

import java.util.Arrays;

public class Array {
    public static int findFirst(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }
    public static int findLast(int[] arr, int x){
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }
    public static int maxAbs(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < Math.abs(arr[i])) max = arr[i];
        }
        return max;
    }
    public static int countPositive(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) count++;
        }
        return count;
    }
    public static boolean palindrom(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) return false;
        }
        return true;
    }
    public static void reverse(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int[] reverseBack(int[] arr){
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }
        return res;
    }
    public static int[] concat(int[] arr1, int[] arr2){
        int[] tmp = new int [arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            tmp[i] = arr1[i];
        }
        int j = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            tmp[j++] = arr2[i];
        }
        int[] res = new int[j];
        for (int i = 0; i < j; i++) {
            res[i] = tmp[i];
        }
        return res;
    }
    public static int[] findAll(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) count++;
        }
        int[] res = new int [count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                res[j] = i;
                j++;
            }
        }
        return res;
    }
    public static int[] deleteNegative(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) count++;
        }
        int[] res = new int [count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                res[j] = arr[i];
                j++;
            }
        }
        return res;
    }
    public static int[] add(int[] arr, int x, int pos){
        int[] res = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < pos) res[i] = arr[i];
            else res[i + 1] = arr[i];
        }
        res[pos] = x;
        return res;
    }
    public static int[] add(int[] arr, int[] ins, int pos){
        int[] res = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            res[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            res[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            res[ins.length + i] = arr[i];
        }
        return res;
    }
}
