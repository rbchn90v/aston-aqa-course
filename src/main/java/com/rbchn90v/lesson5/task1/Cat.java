package com.rbchn90v.lesson5.task1;

public class Cat extends Animal {

    private static int counter;
    private int appetite;
    private boolean isFed;

    public Cat(String name) {
        super(200, 0, name);
        counter++;
    }

    @Override
    public void run(int runningLength) {
        if (runningLength > 0 && runningLength <= runningMaxLength) {
            System.out.println("Кот " + getName() + " пробежал " + runningLength + " м.");
        } else {
            System.out.println("Проверьте введенные данные");
        }
    }

    @Override
    public void swim(int swimmingLength) {
        System.out.println("Кот не умеет плавать");
    }

    public static int getCounter() {
        System.out.println("Всего котов - " + counter);
        return counter;
    }

    public void isFeed(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            appetite = 0;
            isFed = true;
            System.out.println("Кот " + name + " поел");
        } else {
            System.out.println("Насыпьте корма");
        }
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return super.toString() + ", isFed = " + isFed;
    }
}





