package main;

public class Main {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder stringNumbers = new StringBuilder();
        for (int i : numbers) {
            stringNumbers.append(i);
        }
        return String.format("(%s) %s-%s", stringNumbers.substring(0, 3), stringNumbers.substring(3, 6), stringNumbers.substring(6));
    }
}