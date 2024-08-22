//package ReverseVowelsofaString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class reverseVowelsofaString {

    public static void main(String[] args) {

        System.out.println(reverseVowels("hola"));
    }

    public static String reverseVowels(String s) {

        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] cadenaString = s.toCharArray();

        char tmp = ' ';
        char inicio = ' ';
        char fin = ' ';

        int punteroInicio = 0;
        int punteroFin = s.length() -1;

        while( punteroFin >= punteroInicio) {

            if(vowels.contains(cadenaString[punteroInicio])){
                inicio = cadenaString[punteroInicio];
            } else {
                punteroInicio++;
            }

            if(vowels.contains(cadenaString[punteroFin])){
                fin = cadenaString[punteroFin];
            } else {
                punteroFin--;
            }

            if(inicio != ' ' && fin != ' '){

                tmp = cadenaString[punteroInicio]; 
                cadenaString[punteroInicio] = fin;
                cadenaString[punteroFin] = tmp;

                inicio = ' ';
                fin = ' ';
                tmp = ' ';
                punteroInicio++;
                punteroFin--;

            }

        }

        return new String(cadenaString);
    }

}
