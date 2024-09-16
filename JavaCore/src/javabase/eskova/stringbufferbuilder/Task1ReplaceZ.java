package javabase.eskova.stringbufferbuilder;

import java.util.Scanner;

public class Task1ReplaceZ {
    public static void main(String[] args) {
        Scanner in = new Scanner("   mama   zlobno   myla    puzzle  and    ramy   ");
        String[] arr = in.nextLine().split(" +");
        StringBuilder string = new StringBuilder();

        for (String s : arr) {
            string.append(!s.contains("z") ? s + " " : "ERROR ");
        }
        System.out.println(string.toString().trim());
    }
}



