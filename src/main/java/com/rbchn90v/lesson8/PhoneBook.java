package com.rbchn90v.lesson8;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, Set<String>> phoneBook = new TreeMap<>();

    public boolean add(String lastName, String phone) {
        for (Set<String> value : phoneBook.values()) {
            if (value.contains(phone)) {
                return false;
            }
        }
        Set<String> phones = phoneBook.get(lastName);
        if (phones != null) {
            phones.add(phone);
        } else {
            phones = new HashSet<>();
            phones.add(phone);
            phoneBook.put(lastName, phones);
        }
        return true;
    }

    public Set<String> get(String lastName) {
        return phoneBook.get(lastName);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("PhoneBook\n");
        Set<Map.Entry<String, Set<String>>> entries = phoneBook.entrySet();
        for (Map.Entry<String, Set<String>> entry : entries) {
            result.append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
        }
        return result.toString();
    }
}
