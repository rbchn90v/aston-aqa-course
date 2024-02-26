package com.rbchn90v.lesson2;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("Task 1 - " + sumLimit(15, 15));

        checkInteger(0);

        System.out.println("Task 3 - " + returnSign(10));

        System.out.println("Task 4");
        printString("Печатать эту строку.", 5);

        System.out.println("Task 5 - " + leapYear(2024));
        arrayTask6();
        arrayTask7();
        arrayTask8();
        arrayTask9();
        System.out.println("Task 10 - " + Arrays.toString(array(8, 8)));
    }

    public static boolean sumLimit(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkInteger(int a) {
        if (a >= 0) {
            System.out.println("Task 2 - число положительное");
        } else {
            System.out.println("Task 2 - число отрицательное");
        }
    }

    public static boolean returnSign(int num) {
        return num < 0;
    }

    public static void printString(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }

    public static boolean leapYear(int year) {

        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void arrayTask6() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        System.out.println("Task 6 - " + Arrays.toString(arr));
    }

    public static void arrayTask7() {
        int[] empty = new int[100];
        for (int i = 0; i < empty.length; i++) {
            empty[i] = i + 1;
        }
        System.out.println("Task 7 - " + Arrays.toString(empty));
    }

    public static void arrayTask8() {
        int[] multiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < multiply.length; i++) {
            if (multiply[i] < 6) {
                multiply[i] *= 2;
            }
        }
        System.out.println("Task 8 - " + Arrays.toString(multiply));
    }

    public static void arrayTask9() {
        int[][] square = new int[5][5];
        System.out.println("Task 9 ");
        for (int i = 0; i < square.length; i++) {
            for (int j = 0, z = square[i].length - 1; j < square[i].length; j++, z--) {
                if (i == j || i == z) {
                    square[i][j] = 1;
                }
                System.out.print(" " + square[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] array(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

}
