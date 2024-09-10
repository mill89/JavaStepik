package javabase.eskova.cycle;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner("4579");
        int num = in.nextInt();
        if (num < 0) num = -num;

        int count = 0;
        int sum = 0;
        do {
            count++;
            sum += num % 10;
            num = num / 10;
        } while (num > 0);

        System.out.printf("%d %d", count, sum);
    }
}
