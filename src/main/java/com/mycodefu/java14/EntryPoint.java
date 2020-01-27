package com.mycodefu.java14;

import com.mycodefu.java14.records.Bison;
import com.mycodefu.java14.records.Elephant;
import com.mycodefu.java14.records.Hippo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EntryPoint {

    public static void main(String[] args) {
        List<Elephant> elephants = IntStream.rangeClosed(1, 1000).boxed()
                .map(i -> Elephant.random())
                .collect(Collectors.toList());

        Bison bison = new Bison("Billy", 200);

        List<Hippo> hippos = Arrays.asList(
                new Hippo("Edmond", 42, 56, 0.2f),
                new Hippo("Emma", 80, 39, 0.1f),
                new Hippo("Marianne", 73, 30, 0.4f),
                new Hippo("Darcy", 60, 78, 0.2f),
                new Hippo("Mr Collins", 2, 10, 0.5f)
        );

        System.out.println(String.format("Welcome to Java 14!\n"
                + "Here are your Bison!\n%s\n"
                + "Here are your Hippos!\n%s\n"
                + "Here are your Elephants!\n%s"
                , bison, hippos, elephants
        ));

    }

}
