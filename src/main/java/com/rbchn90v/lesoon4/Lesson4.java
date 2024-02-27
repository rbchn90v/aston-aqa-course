package com.rbchn90v.lesoon4;

import java.util.Arrays;

public class Lesson4 {
    public static void main(String[] args) {
        Employee andrey = new Employee("Egorov Andrey Sergeevich", "Engineer", "andrey20@gmail.com", "298506796", 50000, 32);
        Employee irina = new Employee("Divina Irina Ivanovna", "Economist", "irina86@gmail.com", "298745689", 45000.50, 28);

        andrey.printEmployee();
        irina.printEmployee();

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Danilova Daria", "Manager", "danadasha@mail.com", "339668899", 40000, 29);
        persArray[2] = new Person("Zimina Alesya", "Secretary", "alzima@mail.com", "449902525", 36000, 24);
        persArray[3] = new Person("Losev Igor", "Analitic", "losik@mailbox.com", "252906633", 45000, 34);
        persArray[4] = new Person("Drozd Ivan", "Director", "bigboss@gmail.com", "444444444", 500000, 45);

        System.out.println(Arrays.toString(persArray));


        Park.Attractions slide = new Park().new Attractions("Slide", "3 min", 10);
        Park.Attractions carousel = new Park().new Attractions("Carousel", "4 min", 8.5);
        Park.Attractions swing = new Park().new Attractions("Swing", "3 min", 7);

        swing.printAttraction();
        carousel.printAttraction();
        slide.printAttraction();
    }
}
