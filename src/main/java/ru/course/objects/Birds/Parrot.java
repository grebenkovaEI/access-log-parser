package ru.course.objects.Birds;

import java.util.Random;

public class Parrot extends Bird{
    private final String text;
    Random random = new Random();

    public Parrot(String text) {
        this.text = text;
    }

    @Override
    public void canSing() {
        int num = random.nextInt(text.length()) + 1;
        System.out.println(text.substring(0,num));
    }
}
