package com.coreJava.memoryManagement.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private int age;
    List<String> stringList;

    public void addValueInList() {
        stringList = new ArrayList<>(Arrays.asList("DIPU", "RAJU", "PUJA"));
        System.out.println(stringList.toString());
    }

    public void addValueInList2() {
        System.out.println(stringList.toString());
    }
}
