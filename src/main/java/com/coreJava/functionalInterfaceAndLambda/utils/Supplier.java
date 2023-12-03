package com.coreJava.functionalInterfaceAndLambda.utils;

@FunctionalInterface
public interface Supplier <T> {
    T getValue();
}
