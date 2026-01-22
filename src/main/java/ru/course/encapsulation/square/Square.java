package ru.course.encapsulation.square;

import ru.course.objectsAndClasses.dot.Dot;

public class Square {
    private Dot dot;
    private int sideLength;

    public Dot getDot() {
        return new Dot(dot.getX(), dot.getY());
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setDot(Dot dot) {
        this.dot = new Dot(dot.getX(), dot.getY());
    }

    public void setSideLength(int sideLength) {
        if (sideLength <= 0) throw new IllegalArgumentException("Длина стороны обязана быть всегда положительной");
        this.sideLength = sideLength;
    }

    public Square(Dot dot, int sideLength) {
        this.dot = dot;
        if (sideLength <= 0) throw new IllegalArgumentException("Длина стороны обязана быть всегда положительной");
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + dot.toString() + " со стороной " + sideLength;
    }

}
