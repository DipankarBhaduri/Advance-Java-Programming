package coreJava.objectOrentiedProgramming;

import coreJava.objectOrentiedProgramming.utils.StudentClass;

public class Inheritance {
    public static void main(String[] args) {
        StudentClass studentClass = new StudentClass();
        studentClass.setAge(26);
        studentClass.setName("Dipankar Bhaduri");
        studentClass.setContactNumber("8100003959");
        studentClass.setAddress("428/19/a-p, Kazipara, Baidyabati, Baidyabati, Hooghly, WB - 712222");

        System.out.println(studentClass.getName());
        System.out.println(studentClass.getAge());
        System.out.println(studentClass.getAddress());
        System.out.println(studentClass.getContactNumber());
    }
}
