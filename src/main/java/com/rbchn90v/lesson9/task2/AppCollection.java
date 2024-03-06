package com.rbchn90v.lesson9.task2;

import java.util.ArrayList;
import java.util.List;

public class AppCollection {
    public static void main(String[] args) {
        System.out.println("=======================TASK 2=======================");
        List<String> list = new ArrayList<>(List.of("Highload", "High", "Load", "Highload"));
        System.out.println("Все элементы: " + list);
        List<String> list2 = new ArrayList<>(List.of());                                        //пустой список для доп.проверки
        List<String> list3 = new ArrayList<>(List.of("Void", "Dog", "House", "Array", "Book"));  // произвольный  список для доп.проверки


        System.out.println("=======================TASK 2.1=======================");
        System.out.println("Число совпадений: " + countObject(list, "High"));

        System.out.println("=======================TASK 2.2=======================");
        System.out.println(getFirst(list));
        System.out.println(getFirst(list2));
        System.out.println(getFirst(list3));

        System.out.println("=======================TASK 2.3=======================");
        System.out.println(getLast(list));
        System.out.println(getLast(list2));
        System.out.println(getLast(list3));
    }

    public static long countObject(List<String> arr, String find) {
        return arr.stream()
                .filter(p -> p.equals(find))
                .count();
    }

    public static String getFirst(List<String> arr) {
        if (arr.isEmpty()) {
            return "0";
        } else {
            return arr.stream()
                    .findFirst()
                    .get();
        }
    }

    public static String getLast(List<String> arr) {
        if (arr.isEmpty()) {
            return "0";
        } else {
            return arr.get(arr.size() - 1);
        }
    }
}