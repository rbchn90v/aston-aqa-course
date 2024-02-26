package com.rbchn90v.lesoon4;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee() {
        System.out.println(this);
/*
    2 вариант
    System.out.println("name - " + name + "\n"
            + "position - " + position + "\n"
            + "email - " + email
            + "\n" + "phoneNumber - "
            + phoneNumber + "\n" + "salary - "
            + salary + "\n" + "age - "
            + age + "\n");
*/
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}