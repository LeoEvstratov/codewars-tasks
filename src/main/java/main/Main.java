package main;

public class Main {
    public static void main(String[] args) {
        System.out.println(getCount("iaeopuzq"));
        System.out.println(getCount("etat"));
    }

    public static int getCount(String str) {
        final String vowels = "aeiou";

        int vowelsCount = 0;
        for (char c : str.toCharArray()) {
            if (vowels.contains(String.valueOf(c))) vowelsCount++;
        }

        return vowelsCount;
    }
}

