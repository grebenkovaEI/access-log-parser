package ru.course;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        double number = sc.nextDouble();
        System.out.println("Дробная часть числа: " + Math.round(FractionalPart.fraction(number) * 1000.0)/ 1000.0);
    }
}

