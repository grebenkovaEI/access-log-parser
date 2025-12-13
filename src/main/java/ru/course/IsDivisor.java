package ru.course;

public class IsDivisor {
    public static boolean isDivisor (int a, int b){
        boolean res = ((a % b) == 0) || ((b % a) == 0);
        return res;
    }
}
