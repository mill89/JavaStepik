package oneArrays;

import java.util.Random;
import java.util.Scanner;

public class Task1Range {
    public static void main(String[] args) {
        Scanner in = new Scanner("10 7");
        int[] arr = new int[in.nextInt()];
        Random rand = new Random(in.nextInt());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-5, 6);
        }

        for (int n : arr) {
            System.out.printf("%d ", n);
        }
        System.out.printf("\n%d %.1f", sumPositive(arr), mulNegative(arr));
    }

    static int sumPositive(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            if (n > 0) sum += n;
        }
        return sum;
    }

    static double mulNegative(int[] arr) {
        double mul = 1.0;
        for (int n : arr) {
            if (n < 0) {
                mul *= n;
            }
        }
        return mul;
    }
}
