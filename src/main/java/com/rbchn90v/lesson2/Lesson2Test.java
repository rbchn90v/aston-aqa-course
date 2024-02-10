package com.rbchn90v.lesson2;

import org.junit.jupiter.api.Test;

public class Lesson2Test {

    @Test
    void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    @Test
    void checkSumSign() {
        int a = 10;
        int b = 25;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");

        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    @Test
    void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    @Test
    void compareNumbers() {
        int a = 60;
        int b = 100;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    @Test
    void main() {
        System.out.println("Task 1");
        printThreeWords();

        System.out.println();
        System.out.println("Task 2");
        checkSumSign();

        System.out.println();
        System.out.println("Task 3");
        printColor();

        System.out.println();
        System.out.println("Task 4");
        compareNumbers();
    }

}
