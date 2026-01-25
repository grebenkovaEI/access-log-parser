package ru.course.polymorphism.Dots;

public class Time extends DotsDecorator{
    private final String time;

    public Time(Dots dots, String time) {
        super(dots);
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String createDot() {
        return getDots().createDot() + ", время появления точки: " + getTime();
    }
}
