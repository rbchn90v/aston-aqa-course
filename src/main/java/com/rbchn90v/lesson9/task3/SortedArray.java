package com.rbchn90v.lesson9.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedArray {
    public static void main(String[] args) {

        List<String> elements = List.of("f10", "a15", "f2", "f4", "f5", "b54", "a16");
        System.out.println(Arrays.toString(getStrings(elements)));
    }

    private static String[] getStrings(List<String> elements) {
        Comparator<String> comparator = (o1, o2) -> {
            int aLength = o1.length();
            int bLength = o2.length();
            Integer result = null;

            if (o1.equals(o2)) {
                result = 0;
            } else {
                for (int i = 0; i < Math.min(aLength, bLength); i++) {
                    boolean isDigit = Character.isDigit(o1.charAt(i)) && Character.isDigit(o2.charAt(i));

                    if (isDigit) {
                        result = Integer.compare(Integer.parseInt(o1.substring(i)), Integer.parseInt(o2.substring(i)));
                        break;
                    }
                    int diff = o1.charAt(i) - o2.charAt(i);
                    if (diff != 0) {
                        result = diff;
                        break;
                    }
                }
            }
            return result;
        };
        return elements.stream()
                .sorted(comparator)
                .toArray(String[]::new);
    }
}
