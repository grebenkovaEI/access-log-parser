package ru.course.math.SumAllAreas;

import ru.course.geometry.dot.Dot;
import ru.course.geometry.Figures.Circle;
import ru.course.geometry.Figures.Figure;
import ru.course.geometry.Figures.Square;
public class Main {
    public static void main(String[] args) {
        Figure figure1 = new Circle(new Dot(1,1), 2);
        Figure figure2 = new Circle(new Dot(2,2),3);
        Figure figure3 = new Square(new Dot(3,3),4);
        Figure figure4 = new Square(new Dot(5,5),6);

        double sum = SumAllAreas.sumAllAreas(figure1,figure2,figure3,figure4);
        System.out.println("Сумма площадей всех фигур: " + sum);
    }


}

