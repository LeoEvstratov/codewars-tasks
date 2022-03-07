package main;

public class Main {
    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog"));
        System.out.println(check("You shall not pass"));
    }

    public static boolean check(String sentence) {
        final String alphabet = "abcdefghijklmnopqrstuvwxyz";
        final String sentenceLetters = sentence.toLowerCase()
                .chars()
                .distinct()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return sentenceLetters.contains(alphabet);
    }
}

