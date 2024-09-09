package JavaBaseEskova.methods;

import java.util.Scanner;

public class Task1IsPrimeBool {
    public static void main(String[] args) {
        Scanner scan = new Scanner("127 69 -3 0 7"); // true false false false true
        for (int i = 0; i < 5; i++) {
            int number = scan.nextInt();
            System.out.print(isPrime(number) + " ");

        }
    }

    // проверка на простое число
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

