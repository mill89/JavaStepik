package inCycle;

import java.util.Scanner;

public class Task5MultiplicationTable {
    public static void main(String[] args) {
        int num = new Scanner("5").nextInt();
        if (!(0 < num && num < 10)) {
            System.out.println("ERROR");
            return;
        }

        for (int row = 1; row <= num; row++) {
            for (int line = 1; line <= num; line++) {
                System.out.printf("%d\t", line * row);
            }
            System.out.println();
        }
    }
}
