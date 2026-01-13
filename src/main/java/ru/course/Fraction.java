package ru.course;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator <= 0) throw new IllegalArgumentException("Для знаменателя отрицательное значение недопустимо");
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    public Fraction sum(Fraction f){
        int num = this.numerator * f.denominator + this.denominator * f.numerator;
        int den = this.denominator * f.denominator;
        return new Fraction(num, den);
    }
    public Fraction minus(Fraction f){
        int num = this.numerator * f.denominator - this.denominator * f.numerator;
        int den = this.denominator * f.denominator;
        return new Fraction(num, den);
    }
    public Fraction sum(int x){
        int num = this.numerator + this.denominator * x;
        int den = this.denominator;
        return new Fraction(num, den);
    }
    public Fraction minus(int x){
        int num = this.numerator - this.denominator * x;
        int den = this.denominator;
        return new Fraction(num, den);
    }
}
