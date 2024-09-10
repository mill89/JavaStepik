package javabase.eskova.onearrays;

import java.util.Scanner;

public class Task3Replace {
    public static void main(String[] args) {
        Scanner in = new Scanner("8 2 11 2 15 6 2 20 7");
        int[] arr = new int[in.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int minI = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[minI]) minI = i;
        }

        arr[minI] = -1;
        for (int n : arr) {
            System.out.printf("%d ", n);
        }
    }
}
