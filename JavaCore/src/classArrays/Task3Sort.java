package classArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner("10 85 1 4");
        int[] arr = new int[in.nextInt()];
        Random rand = new Random(in.nextInt());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10, 21);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, in.nextInt(), in.nextInt() + 1);
        System.out.println(Arrays.toString(arr));
    }
}
