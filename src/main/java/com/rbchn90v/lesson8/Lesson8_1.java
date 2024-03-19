package com.rbchn90v.lesson8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lesson8_1 {
    public static void main(String[] args) {
        String[] wordsSet = {"Белая", "береза", "под", "моим", "окном", "принакрылась", "снегом", "точно", "серебром",
                "и", "стоит", "береза", "под", "моим", "белая", "и", "горят", "снежинки"};
        System.out.println(Arrays.toString(wordsSet) + " - массив\n");

        Set<String> unicWordsSet = new HashSet<>(List.of(wordsSet));
        System.out.println(unicWordsSet + " - список уникальных слов");

        Map<String, Integer> counter = new HashMap<>();

        for (String s : wordsSet) {
            Integer current = counter.get(s);
            if (current == null) {
                counter.put(s, 1);
            } else {
                counter.put(s, current + 1);
            }
        }
        System.out.println(counter);
    }
}


