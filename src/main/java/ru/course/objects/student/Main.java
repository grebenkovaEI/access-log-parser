package ru.course.objects.student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Иван");
        student.addGrade(5);
        //student.addGrade(1);
        student.addGrade(3);
        student.addGrade(5);
        System.out.println(student);
    }
}

