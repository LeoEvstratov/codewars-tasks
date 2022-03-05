package main;

public class Main {
    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
        System.out.println(makeComplement("GTAT"));
    }

    public static String makeComplement(String dna) {
        char[] chars = dna.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = replaceToOppoSite(chars[i]);
        }
        return String.valueOf(chars);
    }

    private static char replaceToOppoSite(char c) {
        switch (c) {
            case ('A'):
                return 'T';
            case ('T'):
                return 'A';
            case ('C'):
                return 'G';
            case ('G'):
                return 'C';
            default:
                return 0;
        }
    }
}

