package com.rbchn90v.lesson5.task2;

import static java.lang.Math.PI;

public class Circle extends Figure {
    double radius;

    public Circle(double radius, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }

    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
