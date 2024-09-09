package JavaBaseEskova.oneArrays;

import java.util.Random;
import java.util.Scanner;

public class Task2MidNum {
    public static void main(String[] args) {
        Scanner in = new Scanner("10 45");
        double[] arr = new double[in.nextInt()];
        Random rand = new Random(in.nextInt());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble(0, 5);
        }

        printArr(arr);

        double mid = getMidNum(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) arr[i] = mid;
        }

        System.out.printf("%.2f\n", mid);
        printArr(arr);
    }

    static double getMidNum(double[] arr) {
        double sum = 0;
        for (double n : arr) {
            sum += n;
        }
        return sum / arr.length;
    }

    static void printArr(double[] arr) {
        for (double n : arr) {
            System.out.printf("%.2f ", n);
        }
        System.out.println();
    }
}
