package ru.course.enums.operations;

public enum Op {
    ADD {
        public int op(int x, int y){
            return x + y;
        }
    },
    SUB {
        public int op(int x, int y) {
            return x - y;
        }
    },
    DIV {
        public int op(int x, int y) {
            return x / y;
        }
    },
    MULT {
        public int op(int x, int y) {
            return x * y;
        }
    };

    public abstract int op(int x, int y);
}
