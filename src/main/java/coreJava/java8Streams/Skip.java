package coreJava.java8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Skip {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(2,2,2,2,2,2,2,2,2,2));
        List<Integer> skippedList = getList(integerList);
        System.out.println(skippedList.toString());
    }

    private static List<Integer> getList(List<Integer> integerList) {
        return integerList.stream().skip(5).toList();
    }
}
