package ru.course.polymorphism.StringLength;

import ru.course.polymorphism.Measurable.Measurable;
import ru.course.polymorphism.Measurable.PrintLengths;

public class Main {
    public static void main(String[] args) {
        String str = "abc";

        Measurable length = new stringLength(str);
        PrintLengths.printLengths(new Measurable[]{length});
    }
}

