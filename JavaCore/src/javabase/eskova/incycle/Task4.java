package javabase.eskova.incycle;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int height = new Scanner("7").nextInt();
        if (height <= 0) {
            System.out.println("ERROR");
            return;
        }

        for (int i = 1; i <= height; i++, height--) {
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
