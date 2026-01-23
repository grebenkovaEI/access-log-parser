package ru.course.objectsAndClasses.polyline;

import ru.course.objectsAndClasses.dot.Dot;
import ru.course.objectsAndClasses.line.Line;
import ru.course.polymorphism.Measurable.Measurable;

public class PolyLine implements Measurable {
    private final Dot[] arrayDot;

    public PolyLine(Dot[] arrayDot) {
        this.arrayDot = arrayDot;
    }
    public PolyLine() {
        this.arrayDot = new Dot[0];
    }

    public Dot[] getArrayDot() {
        return arrayDot;
    }

    public String toString() {
        String res = "Линия[";
        for (int i = 0; i < arrayDot.length; i++) {
            res += arrayDot[i].toString();
            if (i < arrayDot.length - 1) res += ",";
        }
        res += "]";
        return res;
    }
    public Line[] getLines(){
        Line[] arrayLines = new Line[arrayDot.length - 1];
        for (int i = 0; i < arrayDot.length - 1; i++) {
            Dot start = arrayDot[i];
            Dot end = arrayDot[i + 1];
            arrayLines[i] = new Line(start, end);
        }
        return arrayLines;
    }
    @Override
    public double getLength(){
        double res = 0;
        for (int i = 0; i < arrayDot.length - 1; i++) {
            Line line = new Line(arrayDot[i], arrayDot[i+1]);
            res += line.getLength();
        }
        return res;
    }
}
