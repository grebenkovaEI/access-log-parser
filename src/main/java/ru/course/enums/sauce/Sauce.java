package ru.course.enums.sauce;

public class Sauce {
    private final String name;
    private final Spicy spicy;

    public Sauce(String name, Spicy spicy) {
        this.name = name;
        this.spicy = spicy;
    }

    public String getName() {
        return name;
    }

    public Spicy getSpicy() {
        return spicy;
    }

    @Override
    public String toString() {
        return "Соус " + name + ": " + spicy;
    }
}