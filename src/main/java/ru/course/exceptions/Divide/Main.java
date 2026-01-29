package ru.course.exceptions.Divide;


import ru.course.exceptions.OperationAttemptException.OperationAttemptException;

public class Main {
    public static void main(String[] args) {
        String file = "file.txt";
        try {
            int res = Divide.divide(file);
            System.out.println("Результат: " + res);
        } catch (OperationAttemptException ex) {
            System.out.println("0");
        }
    }
}
