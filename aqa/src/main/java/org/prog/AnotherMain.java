package org.prog;

public class AnotherMain {

    public static void main(String... args) {

//        String s1 = "a";
//        String s2 = new String("a");
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1 == s2);

//        giveMeAString(true);
//        printStuff("b", "aa");
//        printStuff("bb", "aa");
//        printStuff("bbb", "aa");

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 10);

        switchDemo("a");
        switchDemo("b");
        switchDemo("c");
    }

    public static String giveMeAString(boolean isEmpty) {
        return aaa(isEmpty);
    }

    public static String aaa(boolean isEmpty) {
        if (isEmpty) {
            return null;
        } else {
            return "asdasd";
        }
    }

    public static void printStuff(String s1, String s2) {
        if (s1.length() > s2.length()) {
            System.out.println(s1 + s2);
        } else if (s1.length() == s2.length()) {
            System.out.println(s1);
            System.out.println(s2);
        } else {
            System.out.println(s2 + s1);
        }
    }

    public static void switchDemo(String s) {
        switch (s) {
            case "a":
                System.out.println("this is a");
                break;
            case "b":
                System.out.println("this is b");
                break;
            default:
                System.out.println("this is neither a nor b");
                break;
        }
    }
}
