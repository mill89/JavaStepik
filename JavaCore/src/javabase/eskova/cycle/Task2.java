package javabase.eskova.cycle;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner("7 3");
        int a = in.nextInt();
        int b = in.nextInt();
        int c;
        if (a > b) {
            c = a;
            a = b;
            b = c;
        }
        double num = a;

        while (a < b) {
            num *= a + 1;
            ++a;
        }
        System.out.println(num);
    }
}
