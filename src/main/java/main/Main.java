package main;

import java.util.stream.Collector;

public class Main {
    public static void main(String[] args) {
        System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
        System.out.println(longest("abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"));
    }

    public static String longest(String s1, String s2) {
        String concat = s1 + s2;
        return concat.chars().mapToObj(i -> (char) i).distinct().sorted().collect(Collector.of(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append,
                StringBuilder::toString));
    }
}

