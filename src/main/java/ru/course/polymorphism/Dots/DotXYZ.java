package ru.course.polymorphism.Dots;

public class DotXYZ implements Dots{
    private final int x, y, z;

    public DotXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String createDot() {
        return "Точка {" + x + ";" + y + ";" + z + "}";
    }
}
