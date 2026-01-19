package ru.course.line;

import ru.course.*;
import ru.course.dot.Dot;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dot d1 = new Dot(1,3);
        //Dot d2 = new Dot(1,3);
        Dot d3 = new Dot(5,8);

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
    }
}

