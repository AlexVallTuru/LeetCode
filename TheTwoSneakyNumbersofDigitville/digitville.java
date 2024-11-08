package TheTwoSneakyNumbersofDigitville;

import java.util.HashMap;
import java.util.Map;

public class digitville {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

    }

    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        Map<Integer, Integer> counter = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            if (counter.containsKey(num)) {
                result[count++] = num;
                if (count == 2) {
                    return result;
                }
            } else {
                counter.put(num, 0);
            }
        }
        return result;
    }
}
