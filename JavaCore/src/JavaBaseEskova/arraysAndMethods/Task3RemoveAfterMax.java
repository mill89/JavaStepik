package JavaBaseEskova.arraysAndMethods;

import java.util.Random;
import java.util.Scanner;

public class Task3RemoveAfterMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner("10 99");
        int[] array = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(array, seed);
        print(array);
        int[] b = reduceAfterMax(array);
        print(b);
    }

    static void init(int[] arr, long seed) {
        Random rand = new Random(seed);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-3, 6);
        }

    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    static int findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) max = i;
        }
        return max;
    }

    static int[] reduceAfterMax(int[] arr) {
        int max = findMax(arr);
        int[] new_arr = new int[max + 1];
        for (int i = 0; i < new_arr.length; i++) {
            new_arr[i] = arr[i];
        }
        return new_arr;
    }
}
