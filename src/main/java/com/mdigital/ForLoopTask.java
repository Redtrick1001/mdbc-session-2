package com.mdigital;

public class ForLoopTask {
    static void main() {
        int total = 0;
        for (int i = 0; i <= 500; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                total += i;
                System.out.println("i = " + i);
            }
        }
        System.out.println("total = "+ total);
    }
}
