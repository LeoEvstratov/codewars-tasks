package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
        System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
        System.out.println(findShort("Let's travel abroad shall we"));
    }

    public static int findShort(String s) {
        final String[] words = s.split(" ");
        final Optional<String> shortestWord = Arrays.stream(words).min(Comparator.comparingInt(String::length));
        return shortestWord.map(String::length).orElse(0);
    }
}

