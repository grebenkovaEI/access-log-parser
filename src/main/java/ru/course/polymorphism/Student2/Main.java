package ru.course.polymorphism.Student2;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator() {
            @Override
            public boolean isValid(int grade) {
                return grade >= 1 && grade <= 100;
            }
        };
        Student2 student = new Student2("Рома", validator);
        student.addGrade(25);
        student.addGrade(125);
        System.out.println(student);
    }
}

