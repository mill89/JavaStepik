package javabase.eskova.stringbufferbuilder;

import java.util.Scanner;

public class Task2Goroda {
    public static void main(String[] args) {
        Scanner in = new Scanner("хомяк рак аист тур курица");
        String[] arrStr = in.nextLine().split(" ");
        StringBuilder string = new StringBuilder(arrStr[0] + " ");
        String endChar = arrStr[0].substring(arrStr[0].length() - 1);

        for (int count = 1; count < arrStr.length; count++) {
            for (int indx = 1; indx < arrStr.length; indx++) {
                if (arrStr[indx].startsWith(endChar)) {
                    string.append(arrStr[indx] + " ");
                    endChar = arrStr[indx].substring(arrStr[indx].length() - 1);
                    break;
                }
            }
        }
        System.out.println(string.toString().trim());
    }
}
