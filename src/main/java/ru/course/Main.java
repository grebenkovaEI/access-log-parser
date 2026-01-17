package ru.course;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dot d1 = new Dot(1,3);
        Dot d2 = new Dot(1,3);
        Dot d3 = new Dot(5,8);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d1==d2);
        System.out.println(d1==d3);
        System.out.println(d2==d3);
        System.out.println("--------");

        Line l1 = new Line(d1, d3);
        Line l2 = new Line(10,11,15,19);
        Line l3 = new Line(l1.end, l2.start);
        System.out.println(l3);
        l1.end.setX(8);
        l1.end.setY(8);
        l2.start.setX(9);
        l2.start.setY(9);
        System.out.println(l3);
        double sumLength = l1.getLength() + l2.getLength() + l3.getLength();
        System.out.println(sumLength);
        System.out.println("--------");

        Dot dot1 = new Dot(1,5);
        Dot dot2 = new Dot(2,8);
        Dot dot3 = new Dot(5,3);
        Dot dot4 = new Dot(8,9);
        Dot[] arrayDot = {dot1,dot2,dot3,dot4};
        //Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
        PolyLine p1 = new PolyLine(arrayDot);
        System.out.println(p1);
        //Рассчитать длину Ломаной
        double p1Length = p1.getLength();
        System.out.println("Длина ломаной: " + p1Length);
        //Получить у Ломаной массив Линий
        Line[] p1Lines = p1.getLines();
        System.out.println("Массив линий ломаной: " + Arrays.toString(p1Lines));
        //Рассчитать длину массива Линий
        double p1LinesLength = 0;
        for (Line line : p1Lines) {
            p1LinesLength += line.getLength();
        }
        System.out.println("Длина массива линий: " + p1LinesLength);
        //Сравнить длину Ломаной и массива Линий: они должны совпасть
        if (p1Length == p1LinesLength) System.out.println("Длина ломаной и длина массива ломаной совпадают");
        //Изменить координаты Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}. Если изменения отразились в данной точке,
        // в Ломаной и в двух Линиях массива (из пункта 3), то задача решена верно
        dot2.setX(12);
        dot2.setY(8);
        System.out.println("Точка {2,8} изменена на " + dot2);
        System.out.println(p1);
        System.out.println(Arrays.toString(p1Lines));
        System.out.println("--------");

        //Используя разработанную сущность реализуйте схему, представленную на рисунке 1.
        City cityA = new City("A");
        City cityB = new City("B");
        City cityC = new City("C");
        City cityD = new City("D");
        City cityE = new City("E");
        City cityF = new City("F");
        cityA.addNewPath(cityB,5);
        cityA.addNewPath(cityF,1);
        cityA.addNewPath(cityD,6);
        cityB.addNewPath(cityA,5);
        cityB.addNewPath(cityC,3);
        cityC.addNewPath(cityB,3);
        cityC.addNewPath(cityD,4);
        cityD.addNewPath(cityC,4);
        cityD.addNewPath(cityE,2);
        cityD.addNewPath(cityA,6);
        cityE.addNewPath(cityF,2);
        cityE.addNewPath(cityD,2);
        cityF.addNewPath(cityB,1);
        //Далее необходимо методу путешествия объекта B передать некоторое число и вывести возвращенный город на экран:
        //Если передано число 1, результат должен быть либо A, либо С
        //Если передано число 2, результат должен быть либо B, либо D, либо F
        //Если передано число 3, результат может быть любом городом в зависимости от порядка следования путей в списках таковых у городов
        System.out.println("Если передано число 1, результат должен быть либо A, либо С. Результат: "
                + cityB.travelBy(1).name);
        System.out.println("Если передано число 2, результат должен быть либо B, либо D, либо F. Результат: "
                + cityB.travelBy(2).name);
        System.out.println("Если передано число 3, результат может быть любом городом в зависимости от порядка " +
                "следования путей в списках таковых у городов. Результат: " + cityB.travelBy(3).name);
        //Настройте объекты городов так, чтобы при передаче числа 3 последним городом оказался город A
        System.out.println("Задание: Настройте объекты городов так, чтобы при передаче числа 3 последним городом оказался город A");
        System.out.println("Ответ: Настройка не требуется, т.к. объекты уже настроены таким образом.");
        System.out.println("--------");

        Fraction f1 = new Fraction(1,3);
        System.out.println(f1);
        Fraction f2 = new Fraction(2,5);
        System.out.println(f2);
        Fraction f3 = new Fraction(7,8);
        System.out.println(f3);
        System.out.println("Посчитать f1.sum(f2).sum(f3).minus(5), где f1 это одна треть, f2 две пятых, " +
                "а f3 это семь восьмых. Результат: " + f1.sum(f2).sum(f3).minus(5));
        System.out.println("--------");

        Student student = new Student("Иван");
        student.addGrade(5);
        //student.addGrade(1);
        student.addGrade(3);
        student.addGrade(5);
        System.out.println(student);
        System.out.println("--------");

        Department department = new Department("IT");
        Employee employee1 = new Employee("Иван");
        Employee employee2 = new Employee("Семен");
        employee2.setDepartment(department);
        department.setDirector(employee1);
        System.out.println(employee1);
        System.out.println(employee2);
    }
}

