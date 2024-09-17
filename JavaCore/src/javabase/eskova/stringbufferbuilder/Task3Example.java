package javabase.eskova.stringbufferbuilder;

import java.util.Scanner;

public class Task3Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner("8 11");
        int a = scan.nextInt();
        int b = scan.nextInt();
        String str = primer(a, b);
        System.out.println(str);
    }

    static String primer(int a, int b) {
        return String.format("%d + %d = %d", a, b, a + b);
    }
}
