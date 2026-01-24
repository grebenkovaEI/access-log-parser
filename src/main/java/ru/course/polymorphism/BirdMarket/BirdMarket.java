package ru.course.polymorphism.BirdMarket;

import ru.course.polymorphism.Birds.Bird;

public class BirdMarket {
    public static void birdMarket(Bird... birds){
        for (Bird bird : birds){
            bird.canSing();
        }
    }

}
