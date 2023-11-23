package coreJava.Java8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Min {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(2,1,2,3,4,5,3,2,3,4,5,6,7,6,5,-1,7,6,8,6,4,3,2,3));
        int minElement = getMinElement(integerList);
        System.out.println(minElement);
    }

    private static Integer getMinElement(List<Integer> integerList) {
        return integerList.stream().min(Integer::compare).get();
    }
}
