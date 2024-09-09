package JavaBaseEskova.classArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner("5 25");
        double[] arr = new double[in.nextInt()];
        Random rand = new Random(in.nextInt());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble(0, 2);
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        double sum = arr[0] + arr[arr.length - 1];
        System.out.println(sum);
    }
}
