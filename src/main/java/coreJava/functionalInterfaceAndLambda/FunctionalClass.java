package coreJava.functionalInterfaceAndLambda;

import coreJava.functionalInterfaceAndLambda.utils.Functional;

public class FunctionalClass {
    public static void main(String[] args) {
        Functional<String, Integer> stringIntegerFunctional = (Integer integer) -> {
            String str = integer.toString().concat(" - ALL DONE");
                return str;
        };

        System.out.println(stringIntegerFunctional.getValue(100));
    }
}
