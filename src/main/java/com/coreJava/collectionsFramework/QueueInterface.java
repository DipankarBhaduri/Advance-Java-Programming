package com.coreJava.collectionsFramework;

import java.util.*;

public class QueueInterface {
    public static void main(String[] args) {

        // Implementation of Queue
        Queue<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.addAll(new ArrayList<>(Arrays.asList(3, 4, 5)));
        for (Integer integer : integerList) {
            System.out.print(integer+", ");
        }
        System.out.println();

        // Implementation of ArrayDeque
        integerList = new ArrayDeque<>();
        integerList.add(1);
        integerList.add(2);
        integerList.addAll(new ArrayList<>(Arrays.asList(3, 4, 5)));
        integerList.remove(1);
        integerList.removeAll(new ArrayList<>(Arrays.asList(3, 4, 5)));
        for (Integer integer : integerList) {
            System.out.print(integer+", ");
        }
        System.out.println();

        // Implementation of PriorityQueue
        integerList = new PriorityQueue<>();
        integerList.add(1);
        integerList.add(2);
        integerList.addAll(new ArrayList<>(Arrays.asList(3, 4, 5)));
        for (Integer integer : integerList) {
            System.out.print(integer+", ");
        }
    }
}
