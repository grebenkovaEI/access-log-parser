package ru.course.classObject.comparingPolyLines;

import ru.course.classObject.comparingDots.ComparingDots;

import java.util.Arrays;

public class ComparingPolyLines {
     private ComparingDots[] dots;

    public ComparingPolyLines(ComparingDots... dots) {
        this.dots = dots;
    }

    public
    double length(){
        double sum=0,len1,len2;
        for(int i=0;i<dots.length-1;i++){
            len1=dots[i+1].getX()-dots[i].getX();
            len2=dots[i+1].getY()-dots[i].getY();
            sum+=Math.sqrt(len1*len1+len2*len2);
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComparingPolyLines that = (ComparingPolyLines) o;
        return Arrays.equals(dots, that.dots);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(dots);
    }
}
