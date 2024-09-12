package javabase.eskova.string;

import java.util.Scanner;

public class Task4CheckMail {
    public static void main(String[] args) {
        Scanner scan = new Scanner("petr.ivanov@@gmail.com");
        String str = scan.nextLine();
        if (isGMailAddress(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean isGMailAddress(String str) {
        String res = str.replace("@", "");
        return str.endsWith("@gmail.com") && str.length() == res.length() + 1;

//        Еще один способ, находим первый индекс, с этого индекса проверяем срез
//        int ind = str.indexOf('@');
//        String sub = str.substring(ind);
//        return sub.equals("@gmail.com");
    }
}
