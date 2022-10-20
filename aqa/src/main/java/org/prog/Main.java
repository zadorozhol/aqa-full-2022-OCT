package org.prog;

public class Main {

    public static void main(String... args) {
        String[] stringArray = new String[10];
        stringArray[0] = "a";
        stringArray[1] = "b";

        System.out.println(stringArray[0]);//1
        System.out.println(stringArray[1]);//2
        System.out.println(stringArray[2]);//3

        smth("a", "b", "c", "d");
        smth("a");

    }

    public static void smth(String... strings) {
        System.out.println(strings.length);
    }
}
