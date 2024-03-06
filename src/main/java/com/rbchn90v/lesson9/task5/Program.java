package com.rbchn90v.lesson9.task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        System.out.println(programLogin());
    }

    public static List<String> programLogin() {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Stream.generate(scanner::nextLine)                   // Генерируем стрим, в котором значение будут те, что ввели в консоль.
                .takeWhile(s -> !s.isEmpty())                                    // Останавливаемся тогда, когда ввели пустую строку
                .collect(Collectors.toList());
        return list.stream()
                .filter(s -> s.startsWith("f"))
                .collect(Collectors.toList());
    }
}
