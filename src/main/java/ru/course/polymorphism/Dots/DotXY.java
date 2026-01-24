package ru.course.polymorphism.Dots;

public class DotXY implements Dots{
    private final int x, y;

    public DotXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String createDot() {
        return "Точка {" + x + ";" + y + "}";
    }
}
