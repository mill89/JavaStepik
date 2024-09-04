package oneArrays;

import java.util.Random;
import java.util.Scanner;

public class Task4MaxNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner("10 77");
        int[] arr = new int[in.nextInt()];
        Random rand = new Random(in.nextInt());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-5, 16);
        }
        printArr(arr);

        int max = 0;
        int neg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[max]) max = i;
            if (arr[i] < 0) neg = i;
        }

        int tmp = arr[max];
        arr[max] = arr[neg];
        arr[neg] = tmp;

        printArr(arr);
    }

    static void printArr(int[] arr) {
        for (int n : arr) {
            System.out.printf("%d ", n);
        }
        System.out.println();
    }
}
