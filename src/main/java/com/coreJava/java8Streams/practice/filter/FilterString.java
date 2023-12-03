package com.coreJava.java8Streams.practice.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterString {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("Dipankar", "Aniruddha", "Pritam", "Shivam", "Ajay"));
        Scanner scanner = new Scanner(System.in);
        String start = scanner.next();
        String end = scanner.next();
        List<String> filteredList = getFilterList(stringList, start, end);
        filteredList.forEach(name -> System.out.println(name+", "));
    }

    private static List<String> getFilterList(List<String> stringList, String start, String end) {
        return stringList.stream()
                .filter(name -> name.toLowerCase().startsWith(start.toLowerCase()))
                .filter(name -> name.toLowerCase().endsWith(end.toLowerCase()))
                .collect(Collectors.toList());
    }
}
