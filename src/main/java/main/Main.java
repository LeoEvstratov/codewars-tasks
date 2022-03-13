package main;

public class Main {
    public static void main(String[] args) {
//        System.out.println(whoLikesIt("Peter"));
//        System.out.println(whoLikesIt("Peter", "Alice"));
//        System.out.println(whoLikesIt("Peter", "Alice, Bob"));
        System.out.println(whoLikesIt("Peter", "Alice", "Bob", "asdasd", "asd"));
    }

    public static String whoLikesIt(String... names) {
        if (names.length == 0) return "no one likes this";
        if (names.length == 1) return String.format("%s likes this", names[0]);
        if (names.length == 2) return String.format("%s and %s like this", names[0], names[1]);
        if (names.length == 3) return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
        return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
    }
}