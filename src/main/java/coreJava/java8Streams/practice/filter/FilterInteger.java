package coreJava.java8Streams.practice.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterInteger {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8));
        List<Integer> evenNumbers = getEvenNumbers(integerList);
        evenNumbers.forEach(System.out::println);
    }
    private static List<Integer> getEvenNumbers(List<Integer> integerList) {
        return integerList.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }
}
