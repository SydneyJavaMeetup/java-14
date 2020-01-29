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
        String animals = createAnimalsText();
        System.out.println(animals);

    }

    public static String createAnimalsText() {
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


        return String.format("""
                        Welcome to Java 14!

                        Here are your Bison!
                            %s
                        Here are your Hippos!
                            %s
                        Here are your Elephants!
                            %s
                        """
                , bison, hippos, elephants
        );
    }

}
