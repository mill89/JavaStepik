package javabase.eskova.methods;

import java.util.Scanner;

public class Task4Divider {
    public static void main(String[] args) {
        Scanner scan = new Scanner("530 545"); // 540
        int a = scan.nextInt();
        int b = scan.nextInt();
        int max = maxNumberDivider(a, b);
        System.out.println(max);

    }

    static int maxNumberDivider(int a, int b) {
        int maxDiv = countDivider(a);
        int maxN = a;
        for (int i = a; i <= b; i++) {
            if (maxDiv < countDivider(i)) {
                maxDiv = countDivider(i);
                maxN = i;
            }
        }
        return maxN;
    }

    static int countDivider(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
