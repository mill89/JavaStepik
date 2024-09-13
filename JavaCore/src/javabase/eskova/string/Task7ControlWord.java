package javabase.eskova.string;

import java.util.Scanner;

public class Task7ControlWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String control = in.nextLine();
        System.out.println(deleteControlWord(str, control));
    }

    static String deleteControlWord(String str, String word) {
        String s = str.replaceAll("\\b" + word + "\\b", "");
        return s.replaceAll(" +", " ").trim();
    }
}
