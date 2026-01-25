package ru.course.objects.BirdMarket;

import ru.course.objects.Birds.Bird;

public class BirdMarket {
    public static void birdMarket(Bird... birds){
        for (Bird bird : birds){
            bird.canSing();
        }
    }

}
