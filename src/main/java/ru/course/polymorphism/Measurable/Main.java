package ru.course.polymorphism.Measurable;

import ru.course.objectsAndClasses.dot.Dot;
import ru.course.objectsAndClasses.polyline.PolyLine;
import ru.course.polymorphism.ClosedPolyLine.ClosedPolyLine;

public class Main {
    public static void main(String[] args) {
        Dot dot1 = new Dot(1,5);
        Dot dot2 = new Dot(2,8);
        Dot dot3 = new Dot(5,3);
        Dot dot4 = new Dot(8,9);
        Dot[] arrayDot = {dot1,dot2,dot3,dot4};
        PolyLine polyLine = new PolyLine(arrayDot);
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(arrayDot);

        Measurable[] lengths = {polyLine, closedPolyLine};
        PrintLengths.printLengths(lengths);
    }
}

