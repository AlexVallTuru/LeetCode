import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationPhone {

    public static void main(String[] args) {
    
        System.out.println("Hello LeetCoder!!");
    
    }

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        Map<Integer, List<String>> phoneCombinations = new HashMap<>();
        phoneCombinations.put(2, new ArrayList<>(Arrays.asList("a", "b", "c")));
        phoneCombinations.put(3, new ArrayList<>(Arrays.asList("d", "e", "f")));
        phoneCombinations.put(4, new ArrayList<>(Arrays.asList("g", "h", "i")));
        phoneCombinations.put(5, new ArrayList<>(Arrays.asList("j", "k", "l")));
        phoneCombinations.put(6, new ArrayList<>(Arrays.asList("m", "n", "o")));
        phoneCombinations.put(7, new ArrayList<>(Arrays.asList("p", "q", "r", "s")));
        phoneCombinations.put(8, new ArrayList<>(Arrays.asList("t", "u", "v")));
        phoneCombinations.put(9, new ArrayList<>(Arrays.asList("w", "x", "y", "z")));

        if(digits.equals("")) return result;
        if(digits.length() == 1) return phoneCombinations.get(Character.getNumericValue(digits.charAt(0)));

        int len = digits.length();
        for (int i = 0; i < len; i++) {
            phoneCombinations.get(Character.getNumericValue(digits.charAt(i)));
        }
        
        return null;
    }

    public List<String> combiningStrings(List<String> result, List<String> digitsFor) {



        return result;
    }

}
