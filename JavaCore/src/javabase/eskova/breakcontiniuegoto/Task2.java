package javabase.eskova.breakcontiniuegoto;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner("30 100");
        int a = in.nextInt();
        int b = in.nextInt();
        int n = 0;

        for (int i = a; i <= b; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) n++;
            }
            if (n == 2) {
                System.out.printf("%d ", i);
            }
            n = 0;
        }
    }
}
