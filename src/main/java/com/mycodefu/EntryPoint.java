package com.mycodefu;

import java.util.Arrays;
import java.util.List;

public class EntryPoint {
    public static void main(String[] args) {
        List<Elephant> elephants = Arrays.asList(
                new Elephant("Bobby", 3000),
                new Elephant("Dobby", 1020),
                new Elephant("Kobby", 2012)
        );

        System.out.println(String.format("Welcome to Java 14! Here are your elephants!\n%s", elephants));
    }
}
