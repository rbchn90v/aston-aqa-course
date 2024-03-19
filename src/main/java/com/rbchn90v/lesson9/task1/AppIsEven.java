package com.rbchn90v.lesson9.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;


public class AppIsEven {
    public static void main(String[] args) {

        int[] numbers = arrayGenerate(10, 100);          //выбрать необходимую длину массива и диапазон
        System.out.printf("В массиве: %s количество четных чисел: %s",
                Arrays.toString(numbers), count(numbers));
    }

    private static long count(int[] nums) {
        return Arrays.stream(nums)
                .filter(AppIsEven::isEven)
                .count();
    }

    private static boolean isEven(int x) {
        return x % 2 == 0;
    }

    private static int[] arrayGenerate(int length, int range) {
        int[] array;
        Random random = new Random();
        array = IntStream.range(0, length)
                .map(i -> random.nextInt(range))
                .toArray();
        return array;
    }
}





