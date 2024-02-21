package com.rbchn90v.lesson5.task1;

public class Plate {
    private int food;

    public Plate(int food) {
        if (food >= 0) {
            this.food = food;
        } else {
            System.out.println("Не отбирайте у котиков еду!!!");
        }
    }

    public void addFood(int food) {
        if (food >= 0) {
            this.food += food;
            System.out.println("Добавили еды");
        } else {
            this.food = getFood();
            System.out.println("Еда не добавлена. Проверьте вводимые данные");
        }
    }

    public void decreaseFood(int a) {
        if (food < a) {
            System.out.println("Недостаточно еды");
        } else {
            food -= a;
        }
    }

    public int getFood() {
        return food;
    }

    public void getInfo() {
        System.out.println("В тарелке: " + food + " еды");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": food = " + food;
    }
}
