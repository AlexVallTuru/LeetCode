import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithoutRepeating {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");
        longestSubstringWithoutRepeating l = new longestSubstringWithoutRepeating();
        l.lengthOfLongestSubstring("abcabcbb");
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int len = s.length();
        int result = 0;
        int i = 0, j = 0;

        while (i < len && j < len) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                result = Math.max(result, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return result;
    }
}