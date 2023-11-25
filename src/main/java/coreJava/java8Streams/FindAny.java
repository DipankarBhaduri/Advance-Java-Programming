package coreJava.java8Streams;
import java.util.*;
public class FindAny {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(2,1,2,4,5,4,5,6,7,6,5,7,6,8,6,4));
        int findAny = getFindAny(integerList);
        System.out.println(findAny);
    }

    private static Integer getFindAny(List<Integer> integerList) {
        return integerList.stream().filter(num -> num % 3 == 0).findAny().get();
    }
}
