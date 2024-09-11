package javabase.eskova.string;

import java.util.Scanner;

public class Task2ReplaceChars {
    public static void main(String[] args) {
        Scanner in = new Scanner("hello;; by!; ;;");
        String str = in.nextLine();
        System.out.println(str.replace(";", ",."));
    }
}
