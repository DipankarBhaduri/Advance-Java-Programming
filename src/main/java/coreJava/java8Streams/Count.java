package coreJava.Java8Streams;
import java.util.*;
public class Count {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(2,1,2,3,4,2,3));
        int countedValue = (int)integerList.stream().count();
        System.out.println(countedValue);
    }
}
