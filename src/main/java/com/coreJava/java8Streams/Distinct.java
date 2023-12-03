package com.coreJava.java8Streams;

import java.util.Arrays;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3,4,5,6,7,8,9,0,7,6,5,4,3,3,2,4,5,5);
        List<Integer> distinctList = getList(integerList);
        System.out.println(distinctList.toString());
    }

    private static List<Integer> getList(List<Integer> integerList) {
        return integerList.stream().distinct().toList();
    }
}
