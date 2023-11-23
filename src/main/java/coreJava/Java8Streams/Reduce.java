package coreJava.Java8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(2,1,2,3,4,5,3,2,3,4,5,6,7,6,5,7,6,8,6,4,3,2,3));
        List<Integer> reducedList = getList(integerList);
        System.out.println(reducedList.toString());
    }

    private static List<Integer> getList(List<Integer> integerList) {
        return integerList.stream().reduce((num1, num2) -> num1 + num2).stream().toList();
    }
}
