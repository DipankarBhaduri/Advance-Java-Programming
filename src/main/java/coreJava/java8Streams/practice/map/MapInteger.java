package coreJava.java8Streams.practice.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapInteger {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(2, 3, 4, 4, 9, 81, 64));
        List<Integer> sqrtNumbers = convertNumbers(integerList);
        sqrtNumbers.forEach(System.out::println);
    }

    private static List<Integer> convertNumbers(List<Integer> integerList) {
        return integerList.stream().map(num -> (int)Math.sqrt(num)).toList();
    }
}
