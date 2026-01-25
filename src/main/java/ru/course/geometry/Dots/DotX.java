package ru.course.geometry.Dots;

public class DotX implements Dots{
    private final int x;

    public DotX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    @Override
    public String createDot() {
        return "Точка {" + x + "}";
    }
}
