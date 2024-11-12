import java.util.HashMap;
import java.util.Map;

public class permutationDifference{
    public static void main(String[] args) {
    
        System.out.println("Hello LeetCoder!!");
        permutationDifference p = new permutationDifference();
        p.findPermutationDifference("abc", "bac");
    }

    public int findPermutationDifference(String s, String t) {

        int len = t.length();
        Map<Character, Integer> secondString = new HashMap<>();
        
        for (int i = 0; i < len; i++) {
            secondString.put(t.charAt(i), i);
        }
        int result = 0;

        for (int i = 0; i < len; i++) {
            result += Math.abs(i - secondString.get(s.charAt(i)));
        }
        return result;
    }
}