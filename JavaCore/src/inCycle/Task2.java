package inCycle;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner("5 4");
        int height = in.nextInt();
        int wigth = in.nextInt();

        if (height <= 0 || wigth <= 0) {
            System.out.println("ERROR");
            return;
        }

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= wigth; j++) {
                if (i == 1 || i == height || j == 1 || j == wigth) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
