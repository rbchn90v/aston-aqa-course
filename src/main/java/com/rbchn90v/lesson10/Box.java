package com.rbchn90v.lesson10;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruits;

    public Box(List<T> fruits) {
        this.fruits = new ArrayList<>(fruits);
    }

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public float getTotalWeight() {
        if (fruits.isEmpty()) {
            return 0;
        }
        return fruits.get(0).getWeight() * fruits.size();
    }

    public void takeAll(Box<T> box) {
        box.fruits.addAll(this.fruits);
        fruits.clear();
    }

    public boolean compare(Box<?> box) {
        return this.getTotalWeight() == box.getTotalWeight();
    }
}

