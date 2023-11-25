package coreJava.java8Streams;
import java.util.*;
public class NoneMatch {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(2,1,2,3,4,5,3,2,3,4,5,6,7,6,5,7,6,8,6,4,3,2,3));
        boolean noneMatch = isNoneMatch(integerList);
        System.out.println(noneMatch);
    }

    private static boolean isNoneMatch(List<Integer> integerList) {
        return integerList.stream().noneMatch(num -> num > 7);
    }
}
