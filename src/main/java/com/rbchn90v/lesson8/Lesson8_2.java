package com.rbchn90v.lesson8;

public class Lesson8_2 {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        System.out.println("=== phone add ===");
        phoneBook.add("Ivanov", "375-29-515-60-30");
        phoneBook.add("Petrov", "375-29-850-96-33");
        phoneBook.add("Sidorov", "375-44-250-10-00");
        phoneBook.add("Aistov", "375-44-250-10-01");
        phoneBook.add("Aistov", "375-44-250-10-00");//одинаковый номер, но другая фамилия
        phoneBook.add("Bobrov", "375-33-741-85-74");
        phoneBook.add("Andreev", "375-33-741-88-77");
        phoneBook.add("Van", "375-44-258-63-96");
        phoneBook.add("Dmitriev", "375-25-963-58-20");
        phoneBook.add("Dmitriev", "375-33-963-25-25");//одинаковая фамилия, но другой номер

        System.out.println("=== phone get ===");
        System.out.println("Dmitriev" + " : " + phoneBook.get("Dmitriev"));
        System.out.println("Van" + " : " + phoneBook.get("Van"));

        System.out.println("=== phone book ===");
        System.out.println(phoneBook);
    }
}
