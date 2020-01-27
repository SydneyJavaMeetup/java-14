package com.mycodefu.java14.records;

import com.github.javafaker.Faker;

import java.util.Random;

public record Elephant(String name, int weightKilograms){
    private static final Faker faker = new Faker();
    private static final Random random = new Random();

    public static Elephant random(){
        String name = faker.name().fullName();
        int weight = 1800 + random.nextInt(4500);
        return new Elephant(name, weight);
    }
}
