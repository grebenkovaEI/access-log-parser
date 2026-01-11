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
        l1.end.x = 8;
        l1.end.y = 8;
        l2.start.x = 9;
        l2.start.y = 9;
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
        dot2.x = 12;
        dot2.y = 8;
        System.out.println("Точка {2,8} изменена на " + dot2);
        System.out.println(p1);
        System.out.println(Arrays.toString(p1Lines));
    }
}

