package classArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1toStringBinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner("8 11 10");
        int[] arr = new int[in.nextInt()];
        Random rand = new Random(in.nextInt());
        int control = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(2, 16);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int indx = Arrays.binarySearch(arr, control);
        if (indx < 0) {
            System.out.println("ERROR");
            return;
        }
        int[] arr2 = Arrays.copyOf(arr, indx + 1);
        System.out.println(Arrays.toString(arr2));
    }
}
