package ru.course.polymorphism.Birds;

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Sparrow();
        System.out.println("Воробей: ");
        bird1.canSing();

        Bird bird2 = new Cuckoo();
        System.out.println("Кукушка: ");
        bird2.canSing();

        Bird bird3 = new Parrot("Покорми меня");
        System.out.println("Попугай: ");
        bird3.canSing();
    }
}

