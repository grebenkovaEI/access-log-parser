package ru.course.exceptions.NumberFormatException;

public class Sum {
    public static void main(String[] args) {
        double res = 0;
        for (String str : args) {
            try {
                double str1 = Double.parseDouble(str);
                res += str1;
            } catch (NumberFormatException ex){
            }
        }
        System.out.println(res);
    }
}
