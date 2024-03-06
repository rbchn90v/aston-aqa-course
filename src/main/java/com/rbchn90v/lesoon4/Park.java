package com.rbchn90v.lesoon4;

public class Park {

    public class Attractions {
        private String name;
        private String time;
        private double price;

        public Attractions(String name, String time, double price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }

        public void printAttraction() {
            System.out.println("Название - " + name + "\n" + "Время - " + time + "\n" + "Цена - " + price + "\n");
        }

        @Override
        public String toString() {
            return "Attractions{" +
                    "name='" + name + '\'' +
                    ", time='" + time + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
