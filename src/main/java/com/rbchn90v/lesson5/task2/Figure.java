package com.rbchn90v.lesson5.task2;

public abstract class Figure implements PerimeterCalculable, AreaCalculable {
    protected String fillingColor;
    protected String borderColor;

    public Figure(String fillingColor, String borderColor) {
        this.fillingColor = fillingColor;
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ": [Периметр= '" + calculatePerimeter() +
                ", площадь = " + calculateArea() +
                ", цвет фона = '" + fillingColor + '\'' +
                ", цвет границ = '" + borderColor + '\'' +
                ']';
    }
}
