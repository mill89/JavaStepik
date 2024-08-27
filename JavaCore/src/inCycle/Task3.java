package inCycle;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int height = new Scanner(System.in).nextInt();
        if (height <= 0) System.out.println("ERROR");

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
