package ru.course.enums.operations;
public class Main {
    public static void main(String[] args) {
        System.out.println(Op.ADD.op(10,5));
        System.out.println(Op.SUB.op(10,5));
        System.out.println(Op.DIV.op(10,5));
        System.out.println(Op.MULT.op(10,5));
    }

//    static int op(int x, int y, int op){
//        switch(op){
//            case 1: return x+y;
//            case 2: return x-y;
//            case 3: return x*y;
//            case 4: return x/y;
//        }
//        return 0;
//    }
}

