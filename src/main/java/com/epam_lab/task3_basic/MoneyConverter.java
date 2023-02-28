package com.epam_lab.task3_basic;

public class MoneyConverter {

    private MoneyConverter() {
    }

    public static String toConvert(int value) {
        return String.format("%d,%02d", value / 100, value % 100);
    }

    public static String toConvert(double value) {
        return String.format("%.3f", value / 100);
    }
}
