package coreJava.objectOrentiedProgramming.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentClass extends TeacherClass {
    private String name;
    private int age;

    public StudentClass() {
        System.out.println("StudentClass Constructor");
    }

    public void printStudentDetails() {
        System.out.println("Student name = Dipankar & Age : 25");
    }

    public void printStudentDetails(String name) {
        System.out.println("Student name = Dipankar & Age : 26");
    }

    public void printStudentDetails(String name, int age) {
        System.out.println("Student name : "+name+" & Age :"+age);
    }
}
