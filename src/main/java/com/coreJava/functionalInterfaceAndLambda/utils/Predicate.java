package com.coreJava.functionalInterfaceAndLambda.utils;

@FunctionalInterface
public interface Predicate<T> {
    boolean test (T t);
}
