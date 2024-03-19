package com.rbchn90v.lesson9.task4;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );
        System.out.println("=======================TASK 4.1=======================");
        double av = students.stream()
                .filter((p) -> Gender.MAN.equals(p.getGender()))
                .mapToInt(Student::getAge)
                .average()
                .orElseThrow();
        System.out.printf("средний возраст студентов муж.пола: %.2f\n", av);

        System.out.println("=======================TASK 4.2=======================");
        List<Student> army = students.stream()
                .filter((p) -> Gender.MAN.equals(p.getGender())
                        && p.getAge() >= 18
                        && p.getAge() <= 27)
                .collect(Collectors.toList());
        System.out.printf("получат повестку в этом году: %s\n", army);
    }

    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender sex;

        public Student(String name, Integer age, Gender sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return sex;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + sex +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Student student = (Student) o;

            if (!Objects.equals(name, student.name)) return false;
            if (!Objects.equals(age, student.age)) return false;
            return sex == student.sex;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (age != null ? age.hashCode() : 0);
            result = 31 * result + (sex != null ? sex.hashCode() : 0);
            return result;
        }

    }
}

