package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(arrayDiff(new int[]{1, 2}, new int[]{1}));
        System.out.println(arrayDiff(new int[]{1, 2, 2, 2, 3}, new int[]{2}));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        final List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());

        final List<Integer> result = Arrays.stream(a).boxed()
                .filter(i -> !bList.contains(i))
                .collect(Collectors.toList());

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}