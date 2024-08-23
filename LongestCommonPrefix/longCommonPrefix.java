//package LongestCommonPrefix;

import java.util.Arrays;

public class longCommonPrefix {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        System.out.println(longestCommonPrefix(new String[]{"ab","a"}));

    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }
        

        Arrays.sort(strs);

        String strStarter = strs[0];
        String strFin = strs[strs.length -1];

        int minLen = Math.min(strStarter.length(), strFin.length());


        for(int i = 0; i < minLen -1; i++){
            
            if(strStarter.charAt(i) != strFin.charAt(i)){
                return strStarter.substring(0, i);
            }
            if (i+1 == minLen) {
                return strStarter.substring(0, i+1);
            }

        }      

        return "";
    }

}
