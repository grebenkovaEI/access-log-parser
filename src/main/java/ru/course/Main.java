package ru.course;

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
    }
}

