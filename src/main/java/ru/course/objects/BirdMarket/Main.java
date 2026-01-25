package ru.course.objects.BirdMarket;

import ru.course.objects.Birds.Bird;
import ru.course.objects.Birds.Cuckoo;
import ru.course.objects.Birds.Parrot;
import ru.course.objects.Birds.Sparrow;

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Sparrow();
        Bird bird2 = new Sparrow();
        Bird bird3 = new Sparrow();

        Bird bird4 = new Cuckoo();
        Bird bird5 = new Cuckoo();

        Bird bird6 = new Parrot("Покорми меня");
        Bird bird7 = new Parrot("Дай попить");
        Bird bird8 = new Parrot("Хочу играть");

        BirdMarket.birdMarket(bird1,bird4,bird6,bird2,bird5,bird7,bird3,bird8);
    }
}

