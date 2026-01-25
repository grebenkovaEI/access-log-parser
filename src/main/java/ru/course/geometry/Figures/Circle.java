package ru.course.geometry.Figures;

import ru.course.geometry.dot.Dot;

public class Circle extends Figure{
    private final Dot center;
    private final double rad;

    public Circle(Dot dot, double rad) {
        this.center = dot;
        this.rad = rad;
    }

    public Dot getCenter() {
        return center;
    }

    public double getRad() {
        return rad;
    }

    @Override
    public double getArea() {
        return Math.PI * rad * rad;
    }
}
