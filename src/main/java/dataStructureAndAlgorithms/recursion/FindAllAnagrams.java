package dataStructureAndAlgorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {
    public static void main(String[] args) {
        String string = "abccbaabca";
        String pattern = "abc";
        List<Integer> list = new ArrayList<>();
        findAllAnagram(string, pattern, list, 0);
        System.out.println(list.toString());
    }
    private static void findAllAnagram(String string, String pattern, List<Integer> list, int index) {
        if (string != null && pattern != null && index+pattern.length() > string.length()) {
            return;
        }

        if (string.substring(index, index+pattern.length()).equals(pattern)) {
            list.add(index);
            findAllAnagram(string, pattern, list, ++index);
        } else {
            findAllAnagram(string, pattern, list, ++index);
        }
    }
}
