package javabase.eskova.stringbufferbuilder;

import java.util.Scanner;

public class Task4SumNumberFromChars {
    public static void main(String[] args) {
        Scanner in = new Scanner("monkey tiger rabbit 04545455sd555187187");
        char[] arrChars = in.nextLine().toCharArray();

        System.out.println(solution(arrChars));
    }

    static String solution(char[] arr) {
        StringBuilder string = new StringBuilder();
        int result = 0;

        for (char ch : arr) {
            if (Character.isDigit(ch)) {
                string.append(ch + "+");
                result += ch - '0';
            }
        }
        if (string.isEmpty()) return "ERROR";

        string.deleteCharAt(string.length() - 1);
        string.append("=" + result);
        return string.toString();
    }
}
