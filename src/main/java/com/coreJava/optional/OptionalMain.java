package com.coreJava.optional;

import com.coreJava.optional.utils.OptionalCat;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        Optional<OptionalCat> optionalCat = getOptionalCat("Jimmy", 3);
        optionalCat.ifPresent(cat -> System.out.println(cat.getName() + ", " + cat.getAge()));
        System.out.println(optionalCat.get().getName() + ", " + optionalCat.get().getAge());
    }

    private static Optional<OptionalCat> getOptionalCat (String name, int age) {
        OptionalCat optionalCat = new OptionalCat("Jimmy", 6);
        return Optional.ofNullable(optionalCat);
    }
}
