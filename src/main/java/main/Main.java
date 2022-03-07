package main;

public class Main {
    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("A"));
    }

    public static String getMiddle(String word) {
        final int length = word.length();
        final int center = length / 2;
        if (length % 2 == 0) {
            return word.substring(center - 1, center + 1);
        } else {
            return word.substring(center, center+1);
        }
    }
}

