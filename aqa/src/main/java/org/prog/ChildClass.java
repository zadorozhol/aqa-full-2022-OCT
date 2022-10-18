package org.prog;

public class ChildClass extends AnotherClass {

    @Override
    public void printString(String s) {
        printString(s, "");
    }

    public void printString(String s1, String s2) {
        printString(s1, s2, "");
    }

    public void printString(String s1, String s2, String s3) {
        System.out.println(s1 + s2 + s3);
    }
}
