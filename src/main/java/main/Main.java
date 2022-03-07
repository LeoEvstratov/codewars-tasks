package main;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(isTriangle(1, 2, 2));
        System.out.println(isTriangle(7, 2, 2));
    }

    public static boolean isTriangle(int a, int b, int c) {
        final int[] sorted = IntStream.of(a, b, c).sorted().toArray();
        return sorted[0] + sorted[1] > sorted[2];
    }
}

