package org.javajunior.quest.util;


import java.util.Scanner;

public class Input {

    private static final Scanner sc = new Scanner(System.in);

    public static String readString() {
        return sc.next();
    }

    public static int readInt() {
        return sc.nextInt();
    }

}
