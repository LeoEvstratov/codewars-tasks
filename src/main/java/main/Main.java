package main;

public class Main {
    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
        System.out.println(accum("RqaEzty"));
        System.out.println(accum("cwAt"));
    }

    public static String accum(String s) {
        final char[] letters = s.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < letters.length; i++) {
            result.append(String.valueOf(letters[i]).toUpperCase());
            result.append(String.valueOf(letters[i]).toLowerCase().repeat(i));
            if (i < letters.length - 1) result.append("-");
        }

        return result.toString();
    }

//    accum("abcd") -> "A-Bb-Ccc-Dddd"
//    accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//    accum("cwAt") -> "C-Ww-Aaa-Tttt"
}

