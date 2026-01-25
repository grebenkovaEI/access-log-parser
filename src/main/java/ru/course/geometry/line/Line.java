package ru.course.geometry.line;

import ru.course.geometry.dot.Dot;
import ru.course.geometry.Measurable.Measurable;

public class Line implements Measurable {
    private final Dot start, end;
    public Line(Dot start, Dot end) {
        this.start = start;
        this.end = end;
    }
    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Dot(x1, y1);
        this.end = new Dot(x2, y2);
    }

    public Dot getStart() {
        return start;
    }

    public Dot getEnd() {
        return end;
    }

    public String toString() {
        return "Линия от " + this.start.toString() + " до " + this.end.toString();
    }
    @Override
    public double getLength(){
        return Math.sqrt(Math.pow((end.getX() - start.getX()), 2) + Math.pow((end.getY() - start.getY()), 2));
    }
}
