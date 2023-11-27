package coreJava.enums;

public enum DaysOfTheWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    int value;
    DaysOfTheWeek(int i) {
        this.value = i;
    }
}
