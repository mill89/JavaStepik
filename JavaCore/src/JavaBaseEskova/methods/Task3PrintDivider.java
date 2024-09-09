package JavaBaseEskova.methods;

import java.util.Scanner;

public class Task3PrintDivider {
    public static void main(String[] args) {
        Scanner scan = new Scanner("546");  // 546	1 2 3 6 7 13 14 21 26 39 42 78 91 182 273 546
        int number = scan.nextInt();
        printDivider(number);
    }

    static void printDivider(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
