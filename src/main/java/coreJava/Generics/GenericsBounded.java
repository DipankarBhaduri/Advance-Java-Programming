package coreJava.Generics;

import coreJava.Generics.utils.GenericsBoundedUtils;

public class GenericsBounded {
    public static void main(String[] args) {
        GenericsBoundedUtils<Integer, Integer> integerNumber = new GenericsBoundedUtils(12345, 54321);
        GenericsBoundedUtils<Double, String> doubleNumber = new GenericsBoundedUtils(123.45, "Double");
        GenericsBoundedUtils<Float, Character> floatNumber = new GenericsBoundedUtils(4.5, '!');


        System.out.println(integerNumber.getItem2());
        System.out.println(doubleNumber.getItem2());
        System.out.println(floatNumber.getItem2());
    }
}
