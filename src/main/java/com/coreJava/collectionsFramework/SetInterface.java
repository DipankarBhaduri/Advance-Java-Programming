package com.coreJava.collectionsFramework;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {

        // Implementation of HashSet
        Set<Integer> integerList = new HashSet<>();
        integerList.addAll(new ArrayList<>(Arrays.asList(3, 4, 5)));
        integerList.add(1);
        integerList.add(2);
        for (Integer integer : integerList) {
            System.out.print(integer+", ");
        }
        System.out.println();

        // Implementation of ArrayDeque
        integerList = new LinkedHashSet<>();
        integerList.add(2);
        integerList.add(1);
        integerList.addAll(new ArrayList<>(Arrays.asList(3, 4, 5)));
//        integerList.remove(1);
        integerList.removeAll(new ArrayList<>(Arrays.asList(3, 4, 5)));
        for (Integer integer : integerList) {
            System.out.print(integer+", ");
        }
        System.out.println();

        // Implementation of PriorityQueue
        integerList = new TreeSet<>();
        integerList.add(2);
        integerList.add(1);
        integerList.addAll(new ArrayList<>(Arrays.asList(3, 4, 5)));
        for (Integer integer : integerList) {
            System.out.print(integer+", ");
        }
    }
}
