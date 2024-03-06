package com.rbchn90v.lesson5.task1;

public class Lesson5_1 {
    public static void main(String[] args) {

        System.out.println("СОЗДАЛИ ТАРЕЛКУ");
        Plate plate = new Plate(200);
        System.out.println(plate);
        System.out.println("----------------------------");

        System.out.println("СОЗДАЛИ КОТОВ");
        Cat catBob = new Cat("Боб");
        catBob.setAppetite(15);

        Cat catBim = new Cat("Бим");
        catBim.setAppetite(25);

        Cat catPashtet = new Cat("Паштет");
        catPashtet.setAppetite(25);

        System.out.println(catBob);
        System.out.println(catBim);
        System.out.println(catPashtet);
        System.out.println("----------------------------");

        System.out.println("СОЗДАЛИ СОБАК");
        Dog dogFill = new Dog("Филя");
        Dog dogChak = new Dog("Чак");

        System.out.println(dogFill);
        System.out.println(dogChak);
        System.out.println("----------------");

        System.out.println("ПЛАВАЮТ, БЕГАЮТ");
        catBob.swim(10);
        catBob.run(200);
        catBim.swim(-2);
        catPashtet.run(20);
        dogFill.run(501);
        dogFill.run(200);
        dogChak.swim(15);
        dogChak.swim(5);
        dogChak.swim(0);
        System.out.println("----------------");

        System.out.println("КОРМЛЕНИЕ КОТОВ");
        Cat[] cats = {catPashtet, catBob, catBim};
        Plate plate1 = new Plate(62);
        plate1.getInfo();
        for (Cat cat : cats) {
            cat.isFeed(plate1);
            plate1.getInfo();
        }
        System.out.println("----------------------------");

        System.out.println("СЫТОСТЬ КОТОВ");
        System.out.println(catPashtet);
        System.out.println(catBob);
        System.out.println(catBim);
        System.out.println("----------------");

        System.out.println("ДОБАВЛЕНИЕ ЕДЫ В ТАРЕЛКУ");
        plate1.addFood(-100);
        plate1.getInfo();
        plate1.addFood(50);
        plate1.getInfo();
        System.out.println("----------------");

        System.out.println("ДОБАВЛЕНИЕ ЖИВОТНЫХ");

        Animal animal = new Animal("Kit");
        Animal animal1 = new Animal("Lord");

        System.out.println(animal);
        System.out.println(animal1);

        animal1.run(50);
        animal.swim(10);
        System.out.println("----------------");

        countAll();
    }

    public static void countAll() {
        System.out.println("ПОДСЧЕТ");
        Animal.getCounter();
        Dog.getCounter();
        Cat.getCounter();
        System.out.println();
    }
}
