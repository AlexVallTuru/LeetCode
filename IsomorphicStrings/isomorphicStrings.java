import java.util.HashMap;

public class isomorphicStrings {
    
    public static void main(String[] args) {
        
        System.out.println(isIsomorphic("badc", "baba"));

    }

    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> sMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            if(!sMap.containsKey(s.charAt(i))){

                if(sMap.containsValue(t.charAt(i))){
                    return false;
                }

                sMap.put(s.charAt(i), t.charAt(i));

            } else {

                if(sMap.get(s.charAt(i)) != t.charAt(i)) {

                    return false;
                }

            }

        }

        return true;

    }
}

