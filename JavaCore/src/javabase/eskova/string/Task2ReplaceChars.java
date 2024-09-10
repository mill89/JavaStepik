package javabase.eskova.string;

import java.util.Arrays;
import java.util.Scanner;

public class Task2ReplaceChars {
    public static void main(String[] args) {
        Scanner in = new Scanner("hello;; by!; ;;");
        String str = in.nextLine();
        String nStr;
        nStr = str.replace(';', '.');
        while (str.indexOf(';') > 0){
            int i = str.indexOf(';');
            str.charAt(i)=".,";
        }


        System.out.println(nStr);
    }
}
