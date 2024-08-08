//package ValidAnagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class validAnagram {
    
    public static void main(String[] args) {
    
        System.out.println(isAnagram("anagram","nagaram"));

    }

    public static boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        List<Character> caractersS = new ArrayList<>();
        List<Character> caractersT = new ArrayList<>();
        
        for(int i =0; i < s.length(); i++){

            caractersS.add(s.charAt(i));
            caractersT.add(t.charAt(i));

        }
        
        Collections.sort(caractersS);
        Collections.sort(caractersT);
        
        return caractersS.equals(caractersT);
    }

}
