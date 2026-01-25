package ru.course.geometry.polyline;

import ru.course.geometry.dot.Dot;
import ru.course.geometry.line.Line;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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
    }
}

