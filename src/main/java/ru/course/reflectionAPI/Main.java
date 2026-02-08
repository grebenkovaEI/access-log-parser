package ru.course.reflectionAPI;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
        System.out.println("Первоначальный вид объекта: " + cat);
        setFieldsNull(cat);
        System.out.println("Обнуление полей: " + cat);

        Dog dog = new Dog("Chinzan", 3, new ArrayList<>(Arrays.asList("Dekster", "Vupi", "Nami", "Kirill")));
        System.out.println("Первоначальный вид объекта: " + dog);
        setFieldsNull(dog);
        System.out.println("Обнуление полей: " + dog);

    }

    public static void setFieldsNull(Object o) throws IllegalAccessException {
        Class<?> clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Class<?> fieldType = field.getType();
            if (!fieldType.isPrimitive()) {
                field.set(o, null);
            }
        }
    }
}
