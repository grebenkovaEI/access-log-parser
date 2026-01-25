package ru.course.polymorphism.Dots;

public abstract class DotsDecorator implements Dots{
    private final Dots dots;

    public DotsDecorator(Dots dots) {
        this.dots = dots;
    }

    public Dots getDots() {
        return dots;
    }
}
