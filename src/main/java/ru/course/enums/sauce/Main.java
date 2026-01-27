package ru.course.enums.sauce;

public class Main {
    public static void main(String[] args) {
        Sauce s = new Sauce("Ketchup", Spicy.NOT_SPICY);
        Sauce s1 = new Sauce("Chili", Spicy.valueOf("SPICY"));
        Sauce s2 = new Sauce("Buldak", Enum.valueOf(Spicy.class, "VERY_SPICY"));
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}