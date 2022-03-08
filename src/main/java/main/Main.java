package main;

public class Main {
    public static void main(String[] args) {
        System.out.println(makeReadable(0));
        System.out.println(makeReadable(5));
        System.out.println(makeReadable(60));
        System.out.println(makeReadable(86399));
        System.out.println(makeReadable(359999));
    }

    public static String makeReadable(int seconds) {

        final int secondsInHour = 3600;
        final int secondsInMinute = 60;

        final int hh = seconds / secondsInHour;
        final int mm = (seconds - (hh * secondsInHour)) / secondsInMinute;
        final int ss = seconds - (hh * secondsInHour) - (mm * secondsInMinute);

        return String.format("%02d:%02d:%02d", hh, mm, ss);
    }
}