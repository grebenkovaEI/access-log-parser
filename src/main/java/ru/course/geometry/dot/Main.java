package ru.course.geometry.dot;

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
    }
}

