package ru.course.objects.city;

public class Path {
    City name;
    int cost;

    public Path(City name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    public String toString() {
        return name + ": " + cost;
    }
}
