package javabase.eskova.methods;

import java.util.Scanner;

public class Task2CountIsPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner("15 -20");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int kol = simpleInRange(a, b);
        System.out.println(kol);
    }


    static int simpleInRange(int a, int b) {
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;

        }
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    static boolean isPrime(int num) {
        // 1 и 0 не простые числа
        if (num == 1 || num <= 0) return false;
        // проверка чисел, кроме 1 и последнего индекса
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
