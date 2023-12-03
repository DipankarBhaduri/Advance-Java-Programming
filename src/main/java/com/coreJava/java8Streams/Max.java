package com.coreJava.java8Streams;

import java.util.*;

public class Max {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(2,1,2,3,4,5,3,2,3,4,5,6,7,6,5,7,6,8,6,4,3,2,3));
        int maxElement = getMaxElement(integerList);
        System.out.println(maxElement);
    }

    private static Integer getMaxElement(List<Integer> integerList) {
        return integerList.stream().max(Integer::compare).get();
    }
}
