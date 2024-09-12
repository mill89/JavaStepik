package javabase.eskova.string;


import java.util.Scanner;

public class Task3CodewordJoin {
    public static void main(String[] args) {
        Scanner in = new Scanner("""
                To be or ;not; to be?
                tes;ting; is good
                I like ;ham; more then eggs""");

        String psw = "";
        while (in.hasNextLine()) {
            String str = in.nextLine();
            int begin = str.indexOf(';');
            int end = str.indexOf(';', begin + 1);
            psw += str.substring(begin + 1, end);
        }
        System.out.println(psw);
    }
}
