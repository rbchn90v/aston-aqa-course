package com.rbchn90v.lesson5.task2;

public interface PerimeterCalculable {
    double calculatePerimeter();

    default double calculatePerimeter(double[] arr) {
        double result = 0;
        for (double i : arr) {
            result += i;
        }
        return result;
    }
}


