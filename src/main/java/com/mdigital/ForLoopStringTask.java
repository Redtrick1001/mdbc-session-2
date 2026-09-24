package com.mdigital;

import java.util.Scanner;

public class ForLoopStringTask {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what word would you like to be repeated");
        String word = scanner.nextLine();

        System.out.println("how may time would you like it to be repeated");
        int numOfTimes = scanner.nextInt();
        scanner.close();

        System.out.println(stringMultiply(word, numOfTimes));
    }

    public static String stringMultiply(String text, int numOfTimes) {
        if (numOfTimes < 0) {
            return "number need to be a number equal to or greater than 0";
        }

        String result = "";
        for (int i = 0; i < numOfTimes; i++) {
            result += text;
        }

        return result;
    }
}
