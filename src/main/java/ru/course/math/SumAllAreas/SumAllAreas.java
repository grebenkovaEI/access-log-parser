package ru.course.math.SumAllAreas;

import ru.course.geometry.Figures.Figure;

public class SumAllAreas {
    public static double sumAllAreas(Figure... figures){
        double res = 0;
        for (Figure figure : figures){
            res += figure.getArea();
        }
        return res;
    }
}
