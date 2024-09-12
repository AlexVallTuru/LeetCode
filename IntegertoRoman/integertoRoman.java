//package IntegertoRoman;

import java.util.LinkedHashMap;
import java.util.Map;

public class integertoRoman {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        intToRoman(3749);
    }

    public static String intToRoman(int num) {

        Map<String, Integer> romanMap = new LinkedHashMap<>();
        romanMap.put("M", 1000);
        romanMap.put("CM", 900);
        romanMap.put("D", 500);
        romanMap.put("CD", 400);
        romanMap.put("C", 100);
        romanMap.put("XC", 90);
        romanMap.put("L", 50);
        romanMap.put("XL", 40);
        romanMap.put("X", 10);
        romanMap.put("IX", 9);
        romanMap.put("V", 5);
        romanMap.put("IV", 4);
        romanMap.put("I", 1);

        StringBuilder result = new StringBuilder();

        for(Map.Entry<String, Integer> entry : romanMap.entrySet()) {

            String romanString = entry.getKey();
            int valueRoman = entry.getValue();

            while (num >= valueRoman) {
                result.append(romanString);
                num = num - valueRoman;
            }
        }

        return result.toString();

    }

}