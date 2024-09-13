package javabase.eskova.string;

import java.util.Scanner;

public class Task6MaxWord {
    public static void main(String[] args) {
        Scanner in = new Scanner("One apple a day keeps    a doctor    away");
        String str = in.nextLine();

        System.out.println(maxLenghtWord(deleteSpaces(str)));
    }

    static String[] deleteSpaces(String str) {
        return str.trim().split(" +");
    }

    static String maxLenghtWord(String[] str) {
        String maxWord = str[0];
        for (String st : str) {
            if (st.length() > maxWord.length()) maxWord = st;
        }
        return maxWord;
    }
}
