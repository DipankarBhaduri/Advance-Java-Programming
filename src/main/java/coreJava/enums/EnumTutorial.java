package coreJava.enums;

public class EnumTutorial {
    public static void main(String[] args) {
        DaysOfTheWeek days = DaysOfTheWeek.MONDAY;

        if (days == DaysOfTheWeek.MONDAY) {
            System.out.println("Yah its monday & starting the week!!!");
        }

        DaysOfTheWeek[] daysOfTheWeeks = DaysOfTheWeek.values();
        for ( DaysOfTheWeek daysOfTheWeek : daysOfTheWeeks) {
            System.out.println(daysOfTheWeek);
        }

        DaysOfTheWeek.FRIDAY.value = 100;
        int value = DaysOfTheWeek.FRIDAY.value;
        System.out.println(value);
    }
}
