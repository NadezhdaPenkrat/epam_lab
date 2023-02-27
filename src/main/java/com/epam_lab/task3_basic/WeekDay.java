package com.epam_lab.task3_basic;

import java.util.Locale;

public enum WeekDay {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;


    @Override
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
