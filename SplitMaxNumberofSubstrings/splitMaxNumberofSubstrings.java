//package SplitMaxNumberofSubstrings;

import java.util.HashSet;
import java.util.Set;

public class splitMaxNumberofSubstrings {
    public static void main(String[] args) {
    
        System.out.println("Hello LeetCoder!!");
    
        splitMaxNumberofSubstrings s = new splitMaxNumberofSubstrings();

        System.out.println(s.maxUniqueSplit("wwwzfvedwfvhsww"));
    }

    public int maxUniqueSplit(String s) {

        return maxUniqueOperations(new HashSet<>(), s, 0);
    }

    public int maxUniqueOperations(Set<String> set, String s, int index){

        int len = s.length();

        if(index == len) {
            return set.size();
        }

        int max = 0;

        for (int i = index + 1; i <= len; i++) {
        
            String sub = s.substring(index, i);

            if(!set.contains(sub)){
                set.add(sub);
                max = Math.max(max, maxUniqueOperations(set, s, i));
                set.remove(sub);
            }
        }

        return max;
    }
}
