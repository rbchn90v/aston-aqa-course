package com.rbchn90v.lesson10;

import java.util.List;

public class MainLesson10 {
    public static void main(String[] args) {
        //СОЗДАЛИ ФРУКТЫ
        Apple app1 = new Apple();
        Apple app2 = new Apple();
        Apple app3 = new Apple();
        Apple app4 = new Apple();
        Apple app5 = new Apple();
        Apple app6 = new Apple();

        Orange or1 = new Orange();
        Orange or2 = new Orange();
        Orange or3 = new Orange();
        Orange or4 = new Orange();

        //СОЗДАЛИ КОРОБКИ С ФРУКТАМИ

        Box<Apple> appleBox1 = new Box<>(List.of(app1, app2, app3, app4, app5, app6));
        Box<Apple> appleBox2 = new Box<>(List.of(app1, app2, app3));
        Box<Apple> appleBox3 = new Box<>(List.of());                                   //пустая коробка

//      Box<Orange> orangeBox0 = new Box<>(List.of(or1, app1));                       //ошибка
        Box<Orange> orangeBox1 = new Box<>(List.of(or1, or2, or3, or4));
        Box<Orange> orangeBox2 = new Box<>(List.of(or1, or2));
        Box<Orange> orangeBox3 = new Box<>(List.of());                                 //пустая коробка


        System.out.println("Task 4. Посчитать вес коробок");
        System.out.println("вес коробки " + appleBox1.getTotalWeight() + "\n");
        System.out.println("вес коробки " + appleBox3.getTotalWeight() + "\n");
        System.out.println("вес коробки " + orangeBox2.getTotalWeight() + "\n");

        System.out.println("Task 5. Сравнение коробок по весу");
        System.out.println(appleBox1.compare(appleBox2));
        System.out.println(orangeBox1.compare(orangeBox3));
        System.out.println(appleBox2.compare(orangeBox2));                              //сравнили коробку яблок и апельсинов с одинаковым весом

        System.out.println("\nTask 6. Пересыпать фрукты в другую коробку(не мешать яблоки и апельсины)");
        System.out.println("Box1: " + orangeBox3.getTotalWeight() + ", Box2: " + orangeBox1.getTotalWeight());   //пересыпаем апельсины из пустой коробки
        orangeBox3.takeAll(orangeBox1);
        System.out.println("Box1: " + orangeBox3.getTotalWeight() + ", Box2: " + orangeBox1.getTotalWeight() + " Апельсины добавлены\n");

        System.out.println("Box1: " + orangeBox1.getTotalWeight() + ", Box2: " + orangeBox3.getTotalWeight());   //пересыпаем апельсины в пустую коробку
        orangeBox1.takeAll(orangeBox3);
        System.out.println("Box1: " + orangeBox1.getTotalWeight() + ", Box2: " + orangeBox3.getTotalWeight() + " Апельсины добавлены\n");

        System.out.println("Box1: " + appleBox1.getTotalWeight() + ", Box2: " + appleBox2.getTotalWeight());     //пересыпаем яблоки
        appleBox1.takeAll(appleBox2);
        System.out.println("Box1: " + appleBox1.getTotalWeight() + ", Box2: " + appleBox2.getTotalWeight() + " Яблоки добавлены\n");

//      System.out.println("Box1: " + appleBox1.getWeight() + ", Box2: " + orangeBox3.getWeight());       //попробуем перемешать
//      appleBox1.takeAll(orangeBox3);                                                                    //не получится так сделать

        System.out.println("Task 7. Добавить фрукт в коробку");
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple());
        appleBox.add(app1);
        System.out.println("Добавили фрукты в коробку с помощью метода. Вес коробки яблок: " + appleBox.getTotalWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(or1);
        orangeBox.add(new Orange());

        System.out.println("Добавили фрукты в коробку с помощью метода. Вес коробки апельсинов: " + orangeBox.getTotalWeight());
//      orangeBox.add(app1);                                                        //яблоко в коробку апельсинов не добавить

    }
}
