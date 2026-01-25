package ru.course.polymorphism.SumAll;

import ru.course.polymorphism.FractionIsNumber.FractionIsNumber;

public class Main {
    public static void main(String[] args) {
        double sum1 = SumAll.sumAll(2, new FractionIsNumber(3,5), 2.3);
        System.out.println("Пример 1: 2 + 3/5 + 2.3 = " + sum1);
        double sum2 = SumAll.sumAll(3.6, new FractionIsNumber(49,12), 3,
                new FractionIsNumber(3,2));
        System.out.println("Пример 2: 3.6 + 49/12 + 3 + 3/2 = " + sum2);
        double sum3 = SumAll.sumAll(new FractionIsNumber(1,3), 1);
        System.out.println("Пример 3: 1/3 + 1 = " + sum3);
    }


}

