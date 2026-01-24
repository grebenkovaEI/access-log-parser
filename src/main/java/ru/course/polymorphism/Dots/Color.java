package ru.course.polymorphism.Dots;

public class Color extends DotsDecorator{
    private final String color;

    public Color(Dots dots, String color) {
        super(dots);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String createDot() {
        return getDots().createDot() + ", цвет: " + getColor();
    }
}
