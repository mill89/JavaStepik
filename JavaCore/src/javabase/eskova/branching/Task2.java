package javabase.eskova.branching;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner("-357");
        int num = sc.nextInt();
        if (num < 0) {
            num = -num;
        }
        if (String.valueOf(num).length() != 3) {
            System.out.println("ERROR");
            return;
        }
        int n1 = num / 100;
        int n2 = (num - n1 * 100) / 10;
        int n3 = num - n1 * 100 - n2 * 10;

        int sum = 0;
        if (n1 % 2 != 0) sum += n1;
        if (n2 % 2 != 0) sum += n2;
        if (n3 % 2 != 0) sum += n3;
        if (sum == 0) {
            System.out.println("NO");
        } else {
            System.out.println(sum);
        }
    }
}
