package javabase.eskova.string;

import java.util.Arrays;

public class ArrayCharsFromString {
    public static void main(String[] args) {
        String str1 = "Hello world".toLowerCase();
        char arr[] = new char[str1.length()];
        str1.getChars(0, str1.length(), arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
