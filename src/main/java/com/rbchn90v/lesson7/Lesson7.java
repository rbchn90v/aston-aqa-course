package com.rbchn90v.lesson7;

import java.util.Arrays;

public class Lesson7 {
    public static void main(String[] args) {
        String[][] arrayCorrectInt = new String[][]{{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        String[][] wrongSize = new String[][]{{"1", "1", "5", "1"}, {"2", "2", "2", "2"}};
        String[][] wrongData = new String[][]{{"1", "1", "1", "1"}, {"1", "1", "a", "a"}, {"a", "a", "a", "a"}, {"a", "a", "a", "a"}};


        try {
            System.out.println(inputArray(arrayCorrectInt));
            System.out.println(inputArray(wrongData));
            System.out.println(inputArray(wrongSize));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Внимание! Произошла ошибка. " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("\nПрограмма продолжила работу");
    }

    public static int inputArray(String[][] array) {
        if (array.length != 4) {
            throw new MyArraySizeException("Неккоректный размер массива");
        }
        for (String[] strings : array) {
            if (strings.length != 4) {
                throw new MyArraySizeException("Неккоректный размер массива");
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный тип данных. Номер ячейки с ошибкой - [" + i + "]" + "[" + j + "]");
                }
            }
        }
        return sum;
    }
}




