//package CounttheNumberofConsistentString;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class counttheNumberofConsistentString {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        countConsistentStrings("ab", new String[] { "ad", "bd", "aaab", "baa", "badab" });

    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int allowedMask = 0;
        int count = 0;

        for (char c : allowed.toCharArray()) {
            // Convertir la letra c en un número que indica su posición en el abecedario
            // (usando 'a' como referencia).
            // 1 << (c - 'a') es un desplazamiento de bits (bitwise shift).
            allowedMask |= (1 << (c - 'a'));
        }

        for (String word : words) {

            int wordMask = 0;

            for (char c : word.toCharArray()) {
                wordMask |= (1 << (c - 'a'));
            }

            int notAllowedMask = ~allowedMask; // Invertir allowedMask
            int commonBits = wordMask & notAllowedMask; // Verificar los bits en común
            if (commonBits == 0) { // Si no hay bits en común, es consistente
                count++;
            }

        }

        return count;
    }

}
