package ru.course.geometry.Figures;

import ru.course.geometry.dot.Dot;

public class Rectangle extends Figure{
    private final Dot leftTop;
    private final double length1;
    private final double length2;

    public Rectangle(Dot leftTop, double length1, double length2) {
        this.leftTop = leftTop;
        this.length1 = length1;
        this.length2 = length2;
    }

    public Dot getLeftTop() {
        return leftTop;
    }

    public double getLength1() {
        return length1;
    }

    public double getLength2() {
        return length2;
    }

    @Override
    public double getArea() {
        return length1 * length2;
    }
}
