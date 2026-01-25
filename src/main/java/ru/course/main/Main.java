package ru.course.main;

import ru.course.math.exponentiation.Exponentiation;

public class Main {
    public static void main(String[] args) {
        double res = Exponentiation.exponentiation(args[0],args[1]);
        System.out.println(args[0] + " в степени " + args[1] + " = " + res);

    }
}

