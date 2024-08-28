package inCycle;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner("-16 5");
        int a = in.nextInt();
        int b = in.nextInt();

        if (a > b) {
            int x = b;
            b = a;
            a = x;
        }

        int s = 0;
        int num = a;
        if (num < 0) num -= num;
        do {
            s += num % 10;
            num = num / 10;
        } while (num > 0);

        int max = s;
        int maxN = a;

        for (int i = a; i <= b; i++) {
            int sum = 0;
            int n = i;
            if (n < 0) n -= n;

            do {
                sum += n % 10;
                n = n / 10;
            } while (n > 0);

            if (sum > max) {
                max = sum;
                maxN = i;
            }
        }
        System.out.println(maxN);
    }
}
