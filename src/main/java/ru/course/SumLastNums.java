package ru.course;

public class SumLastNums {
    public static int sumLastNums(int x){
        int num1 = x % 10;
        int num2 = (x/10) % 10;
        int res = num1 + num2;
        return res;
    }

}
