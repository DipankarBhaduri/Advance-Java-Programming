package coreJava.objectOrentiedProgramming.utils;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeacherClass {
    private String contactNumber;
    private String address;

    TeacherClass() {
        System.out.println("TeacherClass Constructor");
    }

    public void printStudentDetails() {
        System.out.println("Teacher name = Gourav & Age : 38");
    }
}
