package com.epam_lab.task6_inheritance;

public enum RoundMethod {
    FLOOR {
        @Override
        double roundFunction(double value) {
            return Math.floor(value);
        }
    },
    ROUND {
        @Override
        double roundFunction(double value) {
            return Math.round(value);
        }
    },
    CEIL {
        @Override
        double roundFunction(double value) {
            return Math.ceil(value);
        }
    };

    abstract double roundFunction(double value);
}

