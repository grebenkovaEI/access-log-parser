package ru.course.math.exponentiation;

import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

public class Exponentiation {
    String x, y;

    public Exponentiation(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public static double exponentiation(String x, String y){
        return pow(parseInt(x), parseInt(y));
    }
}
