package coreJava.java8Streams;
import java.util.*;
public class AnyMatch {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(2,1,2,3,4,5,3,2,3,4,5,6,7,6,5,7,6,8,6,4,3,2,3));
        Boolean anyMatched = isAnyMatched(integerList);
        System.out.println(anyMatched);
    }

    private static boolean isAnyMatched(List<Integer> integerList) {
        return integerList.stream().anyMatch(num -> num > 17);
    }
}
