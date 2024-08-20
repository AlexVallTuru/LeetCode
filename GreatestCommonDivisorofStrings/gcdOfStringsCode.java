//package GreatestCommonDivisorofStrings;

public class gcdOfStringsCode {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        String result = gcdOfStrings("ABCABC", "ABC");

        System.out.println(result);

    }

    public static String gcdOfStrings(String str1, String str2) {

        if (str1.equals("") || str2.equals("")) {
            return "";
        }

        if (str1.equals(str2)) {
            return str1;
        }

        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 > len2) {

        } else {
            
        }

        return "";
    }

}