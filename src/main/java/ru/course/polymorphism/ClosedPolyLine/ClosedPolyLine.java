package ru.course.polymorphism.ClosedPolyLine;

import ru.course.objectsAndClasses.dot.Dot;
import ru.course.objectsAndClasses.line.Line;
import ru.course.objectsAndClasses.polyline.PolyLine;

public class ClosedPolyLine extends PolyLine {
    public ClosedPolyLine(Dot[] arrayDot) {
        super(arrayDot);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Line[] getLines() {
        return super.getLines();
    }

    @Override
    public double getLength() {
        double res = super.getLength();
        Dot[] dots = getArrayDot();
        Dot start = dots[0];
        Dot end = dots[dots.length - 1];
        Line line = new Line(start, end);
        res += line.getLength();
        return res;
    }
}
