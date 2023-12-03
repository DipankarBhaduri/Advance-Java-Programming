package com.coreJava.java8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(2,1,2,3,4,5,3,2,3,4,5,6,7,6,5,7,6,8,6,4,3,2,3));
        List<Integer> sortedList = getList(integerList);
        System.out.println(sortedList.toString());
    }

    private static List<Integer> getList(List<Integer> integerList) {
        return integerList.stream().sorted().toList();
    }
}
