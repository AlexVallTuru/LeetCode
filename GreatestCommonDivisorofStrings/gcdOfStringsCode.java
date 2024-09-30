//package GreatestCommonDivisorofStrings;

public class gcdOfStringsCode {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        String result = gcdOfStrings("ABCABC", "ABC");

        System.out.println(result);

    }

    public static String gcdOfStrings(String str1, String str2) {

        // Algoritmo de Euclides o la operación del máximo común divisor (GCD) 

        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }

        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    public static int gcd(int a, int b){

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}