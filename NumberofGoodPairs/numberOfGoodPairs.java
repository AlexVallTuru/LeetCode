package NumberofGoodPairs;

import java.util.HashMap;
import java.util.Map;

public class numberOfGoodPairs {
    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

    }

    public int numIdenticalPairs(int[] nums) {

        Map<Integer, Integer> pair = new HashMap<>();
        int len = nums.length;
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (pair.containsKey(nums[i])) {
                count += pair.get(nums[i]);
                pair.put(nums[i], pair.get(nums[i]) + 1);
            } else {
                pair.put(nums[i], 1);
            }
        }
        return count;
    }
}
