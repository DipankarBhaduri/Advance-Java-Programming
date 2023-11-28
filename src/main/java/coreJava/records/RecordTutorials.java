package coreJava.records;

public class RecordTutorials {
    public static void main(String[] args) {
        EmployeeRecord employeeRecord = new EmployeeRecord("Dipankar", 26);
        System.out.println(employeeRecord.name());
        System.out.println(employeeRecord.age());

        EmployeeRecord.num = 1100101100;
        System.out.println(EmployeeRecord.num);
        employeeRecord.printDetails();
        EmployeeRecord.heyPublicStatic();
    }
}

/*
  1. Record can not extend by other class
  2. Inside record, we can declare any variable, but we have to assign some value
  3. Without declared value need to add in method parameters
  4. We can implement any interface
 */