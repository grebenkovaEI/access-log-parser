package ru.course;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private final List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        for (int grade : grades) {
            if (grade < 2 || grade > 5)
                throw new IllegalArgumentException("Все оценки должны быть в диапазоне от 2 до 5");
        }
        this.grades = grades;
    }
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    //Может возвращать текстовое представление вида “Имя: [оценка1, оценка2,…,оценкаN]” (toString)
    @Override
    public String toString() {
        return name + ": " + grades;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(this.grades);
    }

    public void addGrade(int grade) {
        if (grade < 2 || grade > 5)
            throw new IllegalArgumentException("Все оценки должны быть в диапазоне от 2 до 5");
        else {
            grades.add(grade);
        }
    }
}
