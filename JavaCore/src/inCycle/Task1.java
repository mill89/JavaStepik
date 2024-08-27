package inCycle;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                 System.out.print(i);
            }
            System.out.println();
        }
    }
}
