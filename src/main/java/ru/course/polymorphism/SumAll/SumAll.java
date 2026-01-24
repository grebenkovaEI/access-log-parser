package ru.course.polymorphism.SumAll;

public class SumAll {
    public static double sumAll(Number... numbers){
        double res = 0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }
}
