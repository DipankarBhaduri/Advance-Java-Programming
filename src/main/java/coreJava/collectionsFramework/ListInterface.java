package coreJava.collectionsFramework;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {

        // Implementation of ArrayList
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.addAll(new ArrayList<>(Arrays.asList(3, 4, 5)));
        for (Integer integer : integerList) {
            System.out.print(integer+", ");
        }
        System.out.println();

        // Implementation of LinkedList
        integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.addAll(new ArrayList<>(Arrays.asList(3, 4, 5)));
        integerList.remove(1);
        integerList.removeAll(new ArrayList<>(Arrays.asList(3, 4, 5)));
        for (Integer integer : integerList) {
            System.out.print(integer+", ");
        }
        System.out.println();

        // Implementation of Stack
        Stack<Integer>integerLists = new Stack<>();
        integerLists.add(1);
        integerLists.add(2);
        integerLists.addAll(new ArrayList<>(Arrays.asList(3, 4, 5)));
        for (Integer integer : integerLists) {
            System.out.print(integer+", ");
        }
    }
}
