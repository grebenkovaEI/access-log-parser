package ru.course.geometry.StringLength;

import ru.course.geometry.Measurable.Measurable;
import ru.course.geometry.Measurable.PrintLengths;

public class Main {
    public static void main(String[] args) {
        String str = "abc";

        Measurable length = new stringLength(str);
        PrintLengths.printLengths(new Measurable[]{length});
    }
}

