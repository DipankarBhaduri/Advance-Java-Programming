package string;

import java.util.ArrayList;
import java.util.List;

public class BasicCalculator {
    public static void main(String[] args) {
        String  s = "1+ 1+  1";
        int ans = calculate(s);
        System.out.println(ans);
    }
    public static int calculate(String s) {
        List<Integer> list = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        String str = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                str += ch;
            } else if(ch != ' ') {
                list.add(Integer.parseInt(str));
                str = "";
                list2.add(ch);
            }
        }
        if(!str.equals("")) {
            list.add(Integer.parseInt(str));
        }

        //------------------------>  '/'
        List<Integer> temp = new ArrayList<>();
        List<Character> temp2 = new ArrayList<>();
        for(int i = 0; i < list2.size(); i++) {
            if(list2.get(i) == '/') {
                temp.add(i, (list.get(i) / list.get(i+1)));
                if(i == list2.size() - 1){
                    list = temp;
                    list2 = temp2;
                }
            } else {
                temp2.add(list2.get(i));
                temp.add(list.get(i));
                if(i == list2.size() - 1){
                    temp.add(list.get(i+1));
                    list = temp;
                    list2 = temp2;
                }
            }
        }

        //------------------------>  '*'
        temp = new ArrayList<>();
        temp2 = new ArrayList<>();
        if(list2!= null && list2.size() > 0) for(int i = 0; i < list2.size(); i++) {
            if(list2.get(i) == '*') {
                temp.add(i, (list.get(i) * list.get(i+1)));
                if(i == list2.size() - 1){
                    list = temp;
                    list2 = temp2;
                }
            } else {
                temp2.add(list2.get(i));
                temp.add(list.get(i));
                if(i == list2.size() - 1){
                    temp.add(list.get(i+1));
                    list = temp;
                    list2 = temp2;
                }
            }
        }

        //------------------------>  '-'
        temp = new ArrayList<>();
        temp2 = new ArrayList<>();
        if(list2!= null && list2.size() > 0) for(int i = 0; i < list2.size(); i++) {
            if(list2.get(i) == '-') {
                temp.add(i, (list.get(i) - list.get(i+1)));
                if(i == list2.size() - 1){
                    list = temp;
                    list2 = temp2;
                }
            } else {
                temp2.add(list2.get(i));
                temp.add(list.get(i));
                if(i == list2.size() - 1){
                    temp.add(list.get(i+1));
                    list = temp;
                    list2 = temp2;
                }
            }
        }

        //------------------------>  '+'
        temp = new ArrayList<>();
        temp2 = new ArrayList<>();
        if(list2!= null && list2.size() > 0) for(int i = 0; i < list2.size(); i++) {
            if(list2.get(i) == '+') {
                temp.add(i, (list.get(i) + list.get(i+1)));
                if(i == list2.size() - 1){
                    list = temp;
                    list2 = temp2;
                }
            } else {
                temp2.add(list2.get(i));
                temp.add(list.get(i));
                if(i == list2.size() - 1){
                    temp.add(list.get(i+1));
                    list = temp;
                    list2 = temp2;
                }
            }
        }
        return list.get(0);
    }
}