package com.coreJava.reflection;

import com.coreJava.reflection.utils.Cat;

import java.lang.reflect.Field;

public class ReflectionOnFields {
    public static void main(String[] args) throws IllegalAccessException {
        Cat myCat = new Cat("Jimmy", 5);
        Field[] catFields = myCat.getClass().getDeclaredFields();

        for (Field field : catFields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(myCat, "Stella");
            }
        }

        System.out.println(myCat.getName()+", "+myCat.getAge());
    }
}
