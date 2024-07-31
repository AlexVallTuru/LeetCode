//package RomantoIntegrer;

import java.util.HashMap;
import java.util.Map;

public class romanInteger {

    public static void main(String[] args) {

        int result = romanToInt("D");
        System.out.println(result);
    }

    public static int romanToInt(String s) {

        Map<String, Integer> romanNumbers = new HashMap<>();

        romanNumbers.put("I", 1);
        romanNumbers.put("V", 5);
        romanNumbers.put("X", 10);
        romanNumbers.put("L", 50);
        romanNumbers.put("C", 100);
        romanNumbers.put("D", 500);
        romanNumbers.put("M", 1000);

        char[] letrasIndependientes = s.toUpperCase().toCharArray();
        int result = 0;
        if(letrasIndependientes.length == 1){
            return romanNumbers.get(Character.toString(letrasIndependientes[0]));
        }
        for (int i = 1; i <= letrasIndependientes.length -1; i++) {

            String anterior = Character.toString(letrasIndependientes[i - 1]);
            String actual = Character.toString(letrasIndependientes[i]);

            if (romanNumbers.get(anterior) < romanNumbers.get(actual)) {
                result += romanNumbers.get(actual) - romanNumbers.get(anterior);
                i++;
            } else {
                result += romanNumbers.get(anterior);
            }
            if(i == letrasIndependientes.length -1){
                result += romanNumbers.get(Character.toString(letrasIndependientes[i]));
            }
        }

        return result;

    }

}
