package com.coreJava.functionalInterfaceAndLambda;

import com.coreJava.functionalInterfaceAndLambda.utils.Supplier;

public class SupplierClass {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () ->  "I AM A JAVA DEVELOPER"; {
            System.out.println(stringSupplier.getValue());
        }
    }
}
