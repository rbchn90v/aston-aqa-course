package com.rbchn90v.lesson12;

public class Factorial {
    public static int calculateFactorial(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Invalid input data. The number should be > 0");
        } else if (number == 1) {
            return number;
        } else {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
