package org.javajunior.quest.util;


import org.javajunior.quest.character.Race;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static final Scanner sc = new Scanner(System.in);

    public static String readString() {
        return sc.next();
    }

    public static int readInt() {
        int result;
        try {
            result = sc.nextInt();
        } catch (InputMismatchException e) {
            sc.next(); // clear input
            System.out.println("Введите число");
            result = readInt();
        }

        return result;
    }

    public static <T extends Enum<T>> Enum<T> readEnumValue(Class<T> clazz) {
        int inputNumber = 0;
        while (true) {
            Enum<T>[] values = clazz.getEnumConstants();
            for (int i = 0; i < values.length; i++) {
                System.out.println("" + (i + 1) + " - " + values[i]);
            }
            inputNumber = Input.readInt();
            if ((inputNumber > 0) && (inputNumber < values.length)) {
                break;
            }
        }

        return clazz.getEnumConstants()[inputNumber];
    }

}
