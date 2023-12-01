package coreJava.functionalInterfaceAndLambda.utils;

public class PredicateClass {
    public static void main(String[] args) {
        Predicate<String> predicate = (String str) -> {
            return str.equals("abc");
        };

        boolean result = predicate.test("abcd");
        System.out.println(result);
    }
}
