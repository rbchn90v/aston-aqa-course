package com.rbchn90v.lesson5.task2;

public class Rectangle extends Figure {
    double sideA;
    double sideB;

    public Rectangle(String fillingColor, String borderColor, double sideA, double sideB) {
        super(fillingColor, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    public double calculatePerimeter() {
        return (sideA + sideB) * 2;
    }
}
