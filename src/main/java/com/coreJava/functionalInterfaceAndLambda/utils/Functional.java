package com.coreJava.functionalInterfaceAndLambda.utils;

@FunctionalInterface
public interface Functional <R, T>{
    R getValue(T t);
}
