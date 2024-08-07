import java.util.HashMap;
import java.util.Map;

public class wPattern {

    public static void main(String[] args) {

        boolean result = wordPattern("aba", "dog cat cat");
        System.out.println(result);
    }

    public static boolean wordPattern(String pattern, String s) {

        Map<Character, String> contadorCharacterPattern = new HashMap<>();

        String[] singleStrings = s.split(" ");

        if (pattern.length() != singleStrings.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String currentString = singleStrings[i];

            if(contadorCharacterPattern.containsValue(currentString)){

                if(!contadorCharacterPattern.containsKey(c)){
                    return false;
                }
                if(!contadorCharacterPattern.get(c).equals(currentString)){
                    return false;
                }

            } else {

                if(contadorCharacterPattern.containsKey(c)){
                    if(!contadorCharacterPattern.get(c).equals(currentString)){
                        return false;
                    }
                }

                contadorCharacterPattern.put(c, currentString);

            }

        }

        return true;

    }

}