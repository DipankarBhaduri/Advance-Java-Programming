package coreJava.memoryManagement;

import coreJava.memoryManagement.utils.Person;

public class memoryManagementTutorial {
    public static void main(String[] args) {
        int primitiveVariable = 10;
        Person person = new Person("DIPANKAR", 26);
        String string = "I AM JAVA DEVELOPER";

        // Calling the changeObject method,
        changeObject(person);
    }

    public static void changeObject(Person person) {
        person = new Person("BAISAKHI", 30);
    }
}
