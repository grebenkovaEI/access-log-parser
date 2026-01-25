package ru.course.polymorphism.FractionIsNumber;

public class FractionIsNumber extends Number{
    private final int numerator;
    private final int denominator;

    public FractionIsNumber(int numerator, int denominator) {
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
    public FractionIsNumber sum(FractionIsNumber f){
        int num = this.numerator * f.denominator + this.denominator * f.numerator;
        int den = this.denominator * f.denominator;
        return new FractionIsNumber(num, den);
    }
    public FractionIsNumber minus(FractionIsNumber f){
        int num = this.numerator * f.denominator - this.denominator * f.numerator;
        int den = this.denominator * f.denominator;
        return new FractionIsNumber(num, den);
    }
    public FractionIsNumber sum(int x){
        int num = this.numerator + this.denominator * x;
        int den = this.denominator;
        return new FractionIsNumber(num, den);
    }
    public FractionIsNumber minus(int x){
        int num = this.numerator - this.denominator * x;
        int den = this.denominator;
        return new FractionIsNumber(num, den);
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return (long) numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }
}
