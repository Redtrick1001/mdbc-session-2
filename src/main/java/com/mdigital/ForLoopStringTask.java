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

        /*
        This is done as it is more memory efficient. As each time you go though the loop it creates a new string because
        string are immutable meaning that they can not be changed once they are created
         */
        // StringBuilder result = new StringBuilder();
        // for (int i = 0; i < numOfTimes; i++) {
        //   result.append(text);
        // }
        //
        // return result.toString();

        String result = "";
        for (int i = 0; i < numOfTimes; i++) {
            result += text;
        }

        return result;
    }
}
