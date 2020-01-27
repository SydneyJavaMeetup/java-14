package com.mycodefu;

import com.github.javafaker.Faker;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EntryPoint {

    public static void main(String[] args) {
        Faker faker = new Faker();
        Random random = new Random();

        List<Elephant> elephants = IntStream.rangeClosed(1, 1000).boxed()
                .map(i -> {
                    String name = faker.name().fullName();
                    int weight = 1800 + random.nextInt(4500);

                    return new Elephant(name, weight);
                })
                .collect(Collectors.toList());

        System.out.println(String.format("Welcome to Java 14! Here are your elephants!\n%s", elephants));
        System.out.println("The first elephant is:\n"+elephants.get(0));
    }

}
