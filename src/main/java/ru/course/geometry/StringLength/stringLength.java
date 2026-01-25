package ru.course.geometry.StringLength;

import ru.course.geometry.Measurable.Measurable;

public class stringLength implements Measurable {
    private final String str;

    public stringLength(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public double getLength() {
        return str.length();
    }
}
