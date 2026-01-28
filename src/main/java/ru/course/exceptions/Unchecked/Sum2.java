package ru.course.exceptions.Unchecked;

public class Sum2 {
    public static void main(String[] args){
        double res = 0;
        for (String str : args) {
            boolean isNum = true;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (!Character.isDigit(c)) {
                    isNum = false;
                    break;
                }
            }
            if (isNum) {
                res += Double.parseDouble(str);
            }
        }
        System.out.println(res);
    }
}

//javac ru/course/exceptions/Unchecked/Sum2.java
//java ru/course/exceptions/Unchecked/Sum2 10 34 1
//java ru/course/exceptions/Unchecked/Sum2 10 3qq4 1