package javabase.eskova.string;

import java.util.Scanner;

public class Task8TitleEachWord {
    public static void main(String[] args) {
        Scanner in = new Scanner("one apple a day keeps a doctor away");
        String str = in.nextLine();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = titleWord(arr[i]);
        }
        System.out.println(String.join(" ", arr));

    }

    static String titleWord(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
