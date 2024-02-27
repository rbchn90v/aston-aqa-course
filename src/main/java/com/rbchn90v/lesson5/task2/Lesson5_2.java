package com.rbchn90v.lesson5.task2;

public class Lesson5_2 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        Circle circle = new Circle(10.5, "pink", "black");
        System.out.println(circle);
        System.out.println("Длина окружности - " + circle.calculatePerimeter());
        System.out.println("-------------------------------------");


        Rectangle rectangle = new Rectangle("red", "blue", 5, 10);
        System.out.println(rectangle);
        System.out.println("Периметр прямоугольника - " + rectangle.calculatePerimeter());
        System.out.println("-------------------------------------");

        Triangle triangle = new Triangle("white", "black", 5, 5, 5);
        System.out.println(triangle);
        System.out.println("Периметр треугольника - " + triangle.calculatePerimeter());
        System.out.println("Площадь треугольника - " + triangle.calculateArea());
    }
}
