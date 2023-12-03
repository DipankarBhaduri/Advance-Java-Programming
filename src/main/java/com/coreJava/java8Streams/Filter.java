package com.coreJava.java8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7, 8, 9));
        List<Integer> filteredNumber = getFiltered(list);
        filteredNumber.stream().forEach(System.out::println);
    }

    private static List<Integer> getFiltered(List<Integer> list) {
        return list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
    }
}
