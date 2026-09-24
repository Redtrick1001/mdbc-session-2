package com.mdigital;

import java.util.Scanner;

public class ParkingChargeTask {
    static void main() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("what mode would you like to use");
            String mode = input.nextLine();

            if (mode.equalsIgnoreCase("test")) {
                test();

            } else if (mode.equalsIgnoreCase("x")) {
                input.close();
                break;

            } else {
                System.out.println("what is the current hour");
                int hour = input.nextInt();
                System.out.println(oneHourCharge(hour));
            }
        }
    }

    public static void test() {
        for (int i = 0; i <= 24; i++) {
            System.out.println("Time = " + i);
            System.out.println(oneHourCharge(i));
        }
    }

    public static int oneHourCharge(int hour) {
        if (hour < 0 || hour > 24) {
            System.out.println("Not a time has been entered");
            return -1;
        }

        if (hour <= 5) {
            return 300;
        } else if (hour <= 10) {
            return 350;
        } else if (hour <= 15) {
            return 500;
        } else if (hour <= 20) {
            return 700;
        } else {
            return 400;
        }
    }
}
