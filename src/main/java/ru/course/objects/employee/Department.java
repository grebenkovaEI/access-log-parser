package ru.course.objects.employee;

public class Department {
    private final String name;
    private Employee director;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee getDirector() {
        return director;
    }

    public void setDirector(Employee director) {
        this.director = director;
        if (director.getDepartment() != this) director.setDepartment(this);
    }
}