import java.util.HashMap;
import java.util.Map;

public class longestHappyString {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        longestHappyString l = new longestHappyString();
        l.longestDiverseString(1, 1, 7);
    }

    public String longestDiverseString(int a, int b, int c) {

        StringBuilder result = new StringBuilder();
        int maxCount = a + b + c;

        Map<String, Integer> counter = new HashMap<>();
        counter.put("a", a);
        counter.put("b", b);
        counter.put("c", c);

        while (maxCount > 0) {
            String value = "";

            if (result.length() >= 2 &&
                result.charAt(result.length() - 1) == result.charAt(result.length() - 2)) {

                value = encontrarOtraLetra(counter, String.valueOf(result.charAt(result.length() - 1)));
            } else {
                value = encontrarMaxMinkey(counter, "max");
            }

            if (value == null || counter.get(value) == 0) {
                break;
            }

            result.append(value);
            counter.put(value, counter.get(value) - 1);
            maxCount--;
        }

        return result.toString();
    }

    public static String encontrarMaxMinkey(Map<String, Integer> counter, String maxMin) {
        if (maxMin.equals("max")) {
            return counter.entrySet().stream()
                          .filter(entry -> entry.getValue() > 0) 
                          .max(Map.Entry.comparingByValue())
                          .map(Map.Entry::getKey)
                          .orElse(null);
        } else {
            return counter.entrySet().stream()
                          .filter(entry -> entry.getValue() > 0) 
                          .min(Map.Entry.comparingByValue())
                          .map(Map.Entry::getKey)
                          .orElse(null);
        }
    }

    
    public static String encontrarOtraLetra(Map<String, Integer> counter, String letraProhibida) {
        return counter.entrySet().stream()
                      .filter(entry -> entry.getValue() > 0 && !entry.getKey().equals(letraProhibida)) 
                      .max(Map.Entry.comparingByValue())
                      .map(Map.Entry::getKey)
                      .orElse(null); 
    }
}