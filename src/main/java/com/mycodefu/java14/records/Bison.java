package com.mycodefu.java14.records;

public record Bison(String name, int speedKilometers) {
    public Bison {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Bison always need a name. Please build Bison records with a non-null and not blank string for name.");
        }
        if (speedKilometers < 0) {
            throw new IllegalArgumentException(String.format("Speed may not be less than 0. Speed value passed: %d", speedKilometers));
        }
    }
}
