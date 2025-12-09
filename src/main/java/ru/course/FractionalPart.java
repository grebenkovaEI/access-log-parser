package ru.course;

public class FractionalPart {
    public static double fraction(double x){
        int intPart = (int)x;
        double res = x - intPart;
        return res;
    }
}
