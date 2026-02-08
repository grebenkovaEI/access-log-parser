package ru.course.reflectionAPI;

import java.util.ArrayList;
import java.util.List;

public class Dog {
    private static String breed = "Shiba";
    public String name;
    private int age;
    private List<String> friendsName = new ArrayList<>();

    public Dog(String name, int age, List<String> friendsName) {
        this.name = name;
        this.age = age;
        this.friendsName = friendsName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendsName=" + friendsName +
                '}';
    }
}
