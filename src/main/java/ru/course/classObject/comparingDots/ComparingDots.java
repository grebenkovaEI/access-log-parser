package ru.course.classObject.comparingDots;

import java.util.Objects;

public class ComparingDots implements Cloneable{
    private final int x;
    private final int y;

    public ComparingDots(int x, int y) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComparingDots that = (ComparingDots) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
