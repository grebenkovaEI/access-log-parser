package ru.course.objects.Birds;

import java.util.Random;

public class Cuckoo extends Bird{
    public Cuckoo() {
    }

    Random random = new Random();

    @Override
    public void canSing() {
        int num = random.nextInt(10) + 1;
        for (int i = 0; i < num; i++) {
            System.out.println("ку-ку");
        }
    }
}
