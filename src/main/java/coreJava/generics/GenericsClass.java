package coreJava.generics;

import coreJava.generics.utils.GenericsClassUtils;

public class GenericsClass {
    public static void main(String[] args) {
        GenericsClassUtils<String> genericsString = new GenericsClassUtils<>("Dipankar");
        GenericsClassUtils<Integer> genericsInteger = new GenericsClassUtils<>(12345);
        GenericsClassUtils<Boolean> genericsBoolean = new GenericsClassUtils<>(true);

        System.out.println(genericsString.getItem());
        System.out.println(genericsInteger.getItem());
        System.out.println(genericsBoolean.getItem());
    }
}
