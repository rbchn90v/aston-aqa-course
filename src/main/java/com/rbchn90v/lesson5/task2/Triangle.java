package com.rbchn90v.lesson5.task2;


public class Triangle extends Figure {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(String fillingColor, String borderColor, double sideA, double sideB, double sideC) {
        super(fillingColor, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double perimeter = calculatePerimeter();
        return Math.sqrt(perimeter / 2 * (perimeter / 2 - sideA) * (perimeter / 2 - sideB) * (perimeter / 2 - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return calculatePerimeter(new double[]{sideA, sideB, sideC});
    }
}
