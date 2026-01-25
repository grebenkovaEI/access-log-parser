package ru.course.polymorphism.Student2;

import java.util.ArrayList;
import java.util.List;

public final class Student2 {
    String name;
    private final List<Integer> grades = new ArrayList<>();
    private final Validator validator;

    public Student2(String name, Validator validator) {
        this.name = name;
        this.validator = validator;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return name + ": " + grades;
    }

    public void addGrade(int grade) {
        if (validator.isValid(grade)) grades.add(grade);
        else {
            throw new IllegalArgumentException("Оценка не входит в разрешенный диапазон");
        }
    }
}
