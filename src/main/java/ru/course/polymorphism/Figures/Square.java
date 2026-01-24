package ru.course.polymorphism.Figures;

import ru.course.objectsAndClasses.dot.Dot;

public class Square extends Figure{
    private final Dot leftTop;
    private final double length;

    public Square(Dot leftTop, double length) {
        this.leftTop = leftTop;
        this.length = length;
    }

    public Dot getLeftTop() {
        return leftTop;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
