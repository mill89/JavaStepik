package javabase.eskova.cycle;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner("6 7 3 2 9 5 4 1 7 8");
        int count = 0;
        while (in.hasNextInt()) {
            if (in.nextInt() < 4) {
                count++;
            }
        }
        System.out.println(count);
    }
}
