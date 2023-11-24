package coreJava.Java8Streams;
import java.util.*;
public class FindFirst {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(2,1,2,3,4,5,3,2,3,4,5,6,7,6,5,7,6,8,6,4,3,2,3));
        int findFirst = integerList.stream().filter(num -> num % 2 == 0).findFirst().get();
        System.out.println(findFirst);
    }
}
