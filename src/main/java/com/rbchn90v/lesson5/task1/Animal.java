package com.rbchn90v.lesson5.task1;

public class Animal {
    protected int runningMaxLength;
    protected int swimmingMaxLength;
    protected String name;
    private static int counter;

    public Animal(String name) {
        this.name = name;
        counter++;
    }

    public Animal(int runningMaxLength, int swimmingMaxLength, String name) {
        this.runningMaxLength = runningMaxLength;
        this.swimmingMaxLength = swimmingMaxLength;
        this.name = name;
        counter++;
    }

    public void run(int runningLength) {
        System.out.println("животное бежит " + runningLength);
    }

    public void swim(int swimmingLength) {
        System.out.println("животное плывет " + swimmingLength);
    }

    public static int getCounter() {
        System.out.println("Всего животных - " + counter);
        return counter;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " +
                "runningMaxLength = " + runningMaxLength +
                ", swimmingMaxLength = " + swimmingMaxLength +
                ", name = '" + name + '\'';
    }
}
