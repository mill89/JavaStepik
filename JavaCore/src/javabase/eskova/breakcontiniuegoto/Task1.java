package javabase.eskova.breakcontiniuegoto;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        String ans;
        int n = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) n++;
        }
        ans = n == 2? "YES": "NO";
        System.out.println(ans);
    }
}
