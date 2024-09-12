package javabase.eskova.string;

import java.util.Scanner;

public class Task5EndString {
    public static void main(String[] args) {
        Scanner scan = new Scanner("intel.com.thinksdsds.com");
        String str = scan.nextLine();
        System.out.println(delCom(str));
    }

    static String delCom(String str) {
        if (str.endsWith(".com")) {
            return str.substring(0, str.lastIndexOf(".com"));
        } else {
            return str;
        }
    }
}
