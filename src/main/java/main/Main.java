package main;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPrime(73));
        System.out.println(isPrime(2));
        System.out.println(isPrime(75));
        System.out.println(isPrime(1));
        System.out.println(isPrime(-1));
        System.out.println(isPrime(-5));
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;

        final int sqrt = (int) Math.sqrt(num);
        for (int i = sqrt; i > 1; i--) {
            if (num % i == 0) return false;
        }
        return true;
    }
}