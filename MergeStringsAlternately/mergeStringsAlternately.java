//package MergeStringsAlternately;

public class mergeStringsAlternately {

    public static void main(String[] args) {

        String result = mergeAlternately("abcd", "pq");

        System.out.println(result);
    }

    public static String mergeAlternately(String word1, String word2) {

        if (word1.isEmpty() && word2.isEmpty()) {
            return "";
        }

        if (word1.isEmpty()) {
            return word2;
        }

        if (word2.isEmpty()) {
            return word1;
        }

        int len1 = word1.length();
        int len2 = word2.length();
        int maxLen = Math.max(len1, len2);

        char characterString;
        String result = "";
        for (int i = 0; i < maxLen; i++) {

            if (i < len1) {
                characterString = word1.charAt(i);
                result = result + characterString;
            }
            if(i < len2){
                characterString = word2.charAt(i);
                result = result + characterString;
            }
        }

        return result;
    }

}
