package javabase.eskova.string;

import java.util.Arrays;
import java.util.Scanner;

public class Task1Compare {
    public static void main(String[] args) {
        Scanner in = new Scanner("""
                Иванов
                Андреев
                Кириллов""");

        String arr[] = new String[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextLine();
        }

        Arrays.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
