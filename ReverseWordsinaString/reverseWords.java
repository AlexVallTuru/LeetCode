//package ReverseWordsinaString;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class reverseWords {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        reverseWord("the sky is blue");

    }

    public static String reverseWord(String s) {

        s = s.trim();
        String[] charStrings = s.split("\\s+");

        int len = charStrings.length;
        String reversed = "";

        for (int i = 0; i < len / 2; i++) {
            String temp = charStrings[i];
            charStrings[i] = charStrings[len -i -1];
            charStrings[len -1 -i] = temp;
        }

        return String.join(" ", charStrings);
    }

}
