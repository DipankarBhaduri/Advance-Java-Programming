package coreJava.collectionsFramework;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {

        // Implementation of HashMap
        Map<Integer, Integer> integerList = new HashMap<>();
        integerList.put(2, 20);
        integerList.put(1, 10);
        for (Integer key : integerList.keySet()) {
            System.out.println(key + ", "+integerList.get(key));
        }
        System.out.println("-----");

        // Implementation of LinkedHashMap
        integerList = new LinkedHashMap<>();
        integerList.put(2, 20);
        integerList.put(1, 10);
        integerList.put(3, 10);
        integerList.put(0, 10);
        for (Integer key : integerList.keySet()) {
            System.out.println(key + ", "+integerList.get(key));
        }
        System.out.println("-----");

        // Implementation of TreeMap
        integerList = new TreeMap<>();
        integerList.put(2, 20);
        integerList.put(1, 10);
        for (Integer key : integerList.keySet()) {
            System.out.println(key + ", "+integerList.get(key));
        }
    }
}
