package coreJava.objectOrentiedProgramming;

import coreJava.objectOrentiedProgramming.utils.StudentClass;
import coreJava.objectOrentiedProgramming.utils.TeacherClass;

public class Polymorphism {
    public static void main(String[] args) {
        StudentClass studentClass = new StudentClass();
        studentClass.printStudentDetails("Dipankar");
        studentClass.printStudentDetails("Dipankar", 26);

        studentClass.printStudentDetails();

        TeacherClass teacherClass = new StudentClass();
    }
}
