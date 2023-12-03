package com.coreJava.records;

public record EmployeeRecord(String name, int age) {
    public EmployeeRecord {
        if (age < 0) {
            throw new RuntimeException("Age can not be negative");
        }
    }

    public void printDetails () {
        System.out.println("Name : "+name+", Age : "+age);
    }

    public static void heyPublicStatic () {
        System.out.println("I AM PUBLIC STATIC INSIDE RECORD");
    }

    static int num;
}
