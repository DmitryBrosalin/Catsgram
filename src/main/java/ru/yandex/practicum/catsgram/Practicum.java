package ru.yandex.practicum.catsgram;

import lombok.*;

@Getter
@Setter
class Cat {
    private String color;
    private int age;

    @Override
    public String toString() {
        return "ru.yandex.practicum.catsgram.Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

@ToString
@EqualsAndHashCode
class Person {
    @NonNull
    private String firstName;
    private String lastName;
    private int age;
    @EqualsAndHashCode.Exclude
    private String phone;

    public Person(String firstName, String lastName, int age, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
    }
}

public class Practicum {
    public static void main(String[] args) {
    }
}