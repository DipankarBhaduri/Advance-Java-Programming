package com.coreJava.reflection;

import com.coreJava.reflection.utils.Cat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefectionOnMethods {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat myCat = new Cat("Meow", 2);
        Method[] methods = myCat.getClass().getDeclaredMethods();

        // Access Public Method (if have any parameter in this method then add in same order)
        for (Method method : methods) {
            if (method.getName().equals("heyPublic")) {
                method.invoke(myCat, null);
            }
        }

        // Access Private Method (if have any parameter in this method then add in same order)
        for (Method method : methods) {
            if (method.getName().equals("heyPrivate")) {
                method.setAccessible(true);
                method.invoke(myCat);
            }
        }

        // Access Public Static Method (if have any parameter in this method then add in same order)
        for (Method method : methods) {
            if (method.getName().equals("heyPublicStatic")) {
                method.invoke(null);
            }
        }

        // Access Private Static Method (if have any parameter in this method then add in same order)
        for (Method method : methods) {
            if (method.getName().equals("heyPrivateStatic")) {
                method.setAccessible(true);
                method.invoke(null);
            }
        }
    }
}
