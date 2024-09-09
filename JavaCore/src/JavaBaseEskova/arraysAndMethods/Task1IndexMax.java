package JavaBaseEskova.arraysAndMethods;

import java.util.Random;
import java.util.Scanner;

public class Task1IndexMax {
    public static void main(String[] args) {
        Scanner in = new Scanner("10 15");
        int[] array = new int[in.nextInt()];
        fillArr(array, in.nextInt());
        printArr(array);
        findMax(array);
    }

    static void fillArr(int[] arr, int seed) {
        Random rand = new Random(seed);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(9) - 3; // тоже самое что и  -3 и 6
        }
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    static void findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) max = i;
        }
        System.out.println(max);
    }
}
