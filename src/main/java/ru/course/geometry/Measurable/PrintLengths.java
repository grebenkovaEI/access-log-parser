package ru.course.geometry.Measurable;

public class PrintLengths {

    public static void printLengths(Measurable[] lengths){
        for (Measurable length : lengths) {
            System.out.println("Длина: " + length.getLength());
        }
    }
}
