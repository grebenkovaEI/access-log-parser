package ru.course.encapsulation.fraction;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,3);
        System.out.println(f1);
        Fraction f2 = new Fraction(2,5);
        System.out.println(f2);
        Fraction f3 = new Fraction(7,8);
        System.out.println(f3);
        System.out.println("Посчитать f1.sum(f2).sum(f3).minus(5), где f1 это одна треть, f2 две пятых, " +
                "а f3 это семь восьмых. Результат: " + f1.sum(f2).sum(f3).minus(5));
    }
}

