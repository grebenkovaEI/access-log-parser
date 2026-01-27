package ru.course.classObject.comparingLines;

import ru.course.classObject.comparingDots.ComparingDots;

import java.util.Objects;

public class ComparingLines implements Cloneable{
    private ComparingDots start;
    private ComparingDots end;
    public ComparingLines(ComparingDots start, ComparingDots end) {
        this.start = start;
        this.end = end;
    }

    public ComparingDots getStart() {
        return start;
    }

    public ComparingDots getEnd() {
        return end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComparingLines that = (ComparingLines) o;
        return Objects.equals(start, that.start) && Objects.equals(end, that.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    protected ComparingLines clone() throws CloneNotSupportedException {
        ComparingLines line = (ComparingLines) super.clone();
        line.start = (ComparingDots) this.start.clone();
        line.end = (ComparingDots) this.end.clone();
        return line;
    }
}
