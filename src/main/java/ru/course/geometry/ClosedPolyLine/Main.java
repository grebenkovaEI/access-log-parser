package ru.course.geometry.ClosedPolyLine;

import ru.course.geometry.dot.Dot;
import ru.course.geometry.polyline.PolyLine;

public class Main {
    public static void main(String[] args) {
        Dot dot1 = new Dot(1,5);
        Dot dot2 = new Dot(2,8);
        Dot dot3 = new Dot(5,3);
        Dot dot4 = new Dot(8,9);
        Dot[] arrayDot = {dot1,dot2,dot3,dot4};
        //Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
        PolyLine polyLine = new PolyLine(arrayDot);
        System.out.println(polyLine);
        //Рассчитать длину Ломаной
        double polyLineLength = polyLine.getLength();
        System.out.println("Длина ломаной (незамкнутой): " + polyLineLength);
        //Рассчитать длину замкнутой ломаной
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(arrayDot);
        double closedPolyLineLength = closedPolyLine.getLength();
        System.out.println("Длина замкнутой ломаной: " + closedPolyLineLength);
    }
}

