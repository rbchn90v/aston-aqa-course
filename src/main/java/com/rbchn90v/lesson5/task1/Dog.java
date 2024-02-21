package com.rbchn90v.lesson5.task1;

public class Dog extends Animal {
    private static int counter;

    public Dog(String name) {
        super(500, 10, name);
        counter++;
    }

    @Override
    public void run(int runningLength) {
        if (runningLength > 0 && runningLength <= runningMaxLength) {
            System.out.println("Собака " + name + " пробежала " + runningLength + " м.");
        } else {
            System.out.println("Проверьте введенные данные");
        }
    }

    @Override
    public void swim(int swimmingLength) {
        if (swimmingLength > 0 && swimmingLength <= swimmingMaxLength) {
            System.out.println("Собака " + name + " проплыла " + swimmingLength + " м.");
        } else {
            System.out.println("Проверьте введенные данные");
        }
    }

    public static int getCounter() {
        System.out.println("Всего собак - " + counter);
        return counter;
    }

}
