package com.epam_lab.task9_collections;

import java.util.Locale;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    @Override
    public String toString() {

        return name().toLowerCase(Locale.ROOT);
    }
}
