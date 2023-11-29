package coreJava.java8Streams.practice.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapString {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("Dipankar", "Aniruddha", "Pritam", "Shivam", "Ajay"));
        List<String> upperCaseList = getUpperCaseList(stringList);
        upperCaseList.forEach(System.out::println);
    }

    private static List<String> getUpperCaseList(List<String> stringList) {
        return stringList.stream().map(string -> string.toUpperCase()).toList();
    }
}
