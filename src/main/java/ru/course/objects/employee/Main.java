package ru.course.objects.employee;


public class Main {
    public static void main(String[] args) {
        Department department = new Department("IT");
        Employee employee1 = new Employee("Иван");
        Employee employee2 = new Employee("Семен");
        employee2.setDepartment(department);
        department.setDirector(employee1);
        System.out.println(employee1);
        System.out.println(employee2);
    }
}

