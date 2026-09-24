package com.mdigital;

import java.util.Scanner;

public class GolfScoreTask {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("what mode would you like to use");
        String mode = input.nextLine();
        if (mode.equalsIgnoreCase("test")) {
            test();
        } else {
            System.out.println("Please enter what par is");
            int par = input.nextInt();
            System.out.println("Please enter what score you got");
            int strokes = input.nextInt();
            System.out.println(getScore(strokes, par));
        }
        input.close();
    }


    public static void test() {
        for (int strokes = 0; strokes < 10; strokes++) {
            for (int par = 0; par < 10; par++) {
                System.out.println("-----------------------");
                System.out.println("strokes = " + strokes);
                System.out.println("par = " + par);
                System.out.println(getScore(strokes, par));
                System.out.println("------------------------");
            }
        }
    }

    public static String getScore(int numOfStrokes, int par) {
        String[] shotNames = {
                "Hole in one!", "Eagle", "Birdie",
                "Par", "Bogey", "Double Bogey", "Quit"
        };

        if ((numOfStrokes <= 0) || (par <= 0)) {
            return "input are less than zero please don't";
        }

        if (numOfStrokes == 1) {
            return shotNames[0];
        } else if (numOfStrokes <= par - 2) {
            return shotNames[1];
        } else if (numOfStrokes == par - 1) {
            return shotNames[2];
        } else if (numOfStrokes == par) {
            return shotNames[3];
        } else if (numOfStrokes == par + 1) {
            return shotNames[4];
        } else if (numOfStrokes == par + 2) {
            return shotNames[5];
        } else if (numOfStrokes >= par + 3) {
            return shotNames[6];
        } else {
            return "something went wrong";
        }
    }
}
