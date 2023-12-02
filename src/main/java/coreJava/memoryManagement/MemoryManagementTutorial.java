package coreJava.memoryManagement;

import coreJava.memoryManagement.utils.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class memoryManagementTutorial {
    static List<Integer> integerList;

    public static void main(String[] args) {
        int primitiveVariable = 10;
        Person person = new Person("DIPANKAR", 26, null);
        String string = "I AM JAVA DEVELOPER";

        // Calling the changeObject method,
        changeObject(person);

        // Call person class's methods;
        person.addValueInList();

        // Call person class's methods;
        person.addValueInList2();
    }

    private static void addValueInList(List<Integer> integerList) {
        integerList = new ArrayList<>(Arrays.asList(7, 8, 9));
        System.out.println(integerList.toString());
    }

    /**
     * @param person : Passing person object in change method to
     *                 update the local value of person
     */
    public static void changeObject(Person person) {
        person = new Person("BAISAKHI", 30, null);
        integerList = new LinkedList<>(Arrays.asList(3, 4, 5, 6));
        addValueInList(integerList);
        System.out.println(integerList.toString());
    }


}
