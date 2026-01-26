package ru.course.classObject;

import java.util.Objects;

public class ComparingFractions implements Cloneable{
    private final int num;
    private final int denum;

    public ComparingFractions(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    public int getNum() {
        return num;
    }

    public int getDenum() {
        return denum;
    }

    public String toString() {
        return num + "/" + denum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComparingFractions that = (ComparingFractions) o;
        return num == that.num && denum == that.denum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, denum);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
