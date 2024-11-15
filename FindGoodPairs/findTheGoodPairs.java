package FindGoodPairs;

import java.util.HashMap;
import java.util.Map;

public class findTheGoodPairs {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        findTheGoodPairs n = new findTheGoodPairs();
        n.numberOfPairs(new int[] { 1, 2, 4, 12 }, new int[] { 1, 4 }, 3);
    }

    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1)
            map.put(num, map.getOrDefault(num, 0) + 1);
        int len = nums2.length;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            for (int i = 0; i < len; i++) {
                if (entry.getKey() % (nums2[i] * k) == 0)
                    count += entry.getValue();
            }
        }
        return count;
    }

}
