package ru.course.polymorphism.Birds;

public class Sparrow extends Bird{
    public Sparrow() {
    }

    @Override
    public void canSing() {
        System.out.println("чырык");
    }
}
