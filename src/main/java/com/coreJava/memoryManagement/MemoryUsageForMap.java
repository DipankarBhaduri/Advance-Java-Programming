package com.coreJava.memoryManagement;
import com.coreJava.memoryManagement.utils.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MemoryUsageForMap {
    public static void main(String[] args) {
        System.gc();
        printMemory();

        Person student = new Person();
        student.setAge(26);
        student.setName("Dipankar");
        student.setStringList(new ArrayList<>(Arrays.asList("1111111111", "222222222", "3333333333")));

        Person student2 = new Person();
        student.setAge(25);
        student.setName("Pritam");
        student.setStringList(new ArrayList<>(Arrays.asList("1111111111", "222222222", "3333333333")));

        Person student3 = new Person();
        student.setAge(25);
        student.setName("Pritam");
        student.setStringList(new ArrayList<>(Arrays.asList("1111111111", "222222222", "3333333333")));

        Map<String, Person> stringStudentMap = new HashMap<>();
        stringStudentMap.put("1", student);
        stringStudentMap.put("11", student);
        stringStudentMap.put("111", student);
        stringStudentMap.put("11111", student);
        stringStudentMap.put("1111111", student);
        stringStudentMap.put("11111111", student3);
        stringStudentMap.put("2", student);
        stringStudentMap.put("3", student2);
        stringStudentMap.put("4", student2);

        stringStudentMap.get("1").getStringList().add("44444444444");

        System.gc();
        printMemory();
    }
    private static void printMemory() {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();

        System.out.println("Memory: Used=" + (totalMemory - freeMemory) + " Total=" + totalMemory + " Free=" + freeMemory);
    }
}
