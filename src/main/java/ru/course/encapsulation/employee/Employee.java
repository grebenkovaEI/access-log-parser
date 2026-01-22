package ru.course.encapsulation.employee;

public class Employee {
    private final String name;
    private Department department;

    public Employee(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    //Сотрудник может быть приведен к текстовой форме вида: “Имя работает в отделе Название, начальник которого Имя”.
    //В случае если сотрудник является руководителем отдела, то текстовая форма должна быть “Имя начальник отдела Название”.
    @Override
    public String toString() {
        if (this == department.getDirector()) return name + " начальник отдела " + department.getName();
        else
            return name + " работает в отделе " + department.getName() + ", начальник которого "
                    + department.getDirector().getName();
    }
}
