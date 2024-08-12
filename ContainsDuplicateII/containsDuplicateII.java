package ContainsDuplicateII;

import java.util.HashSet;

public class containsDuplicateII {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        boolean result = containsNearbyDuplicate(new int[] { 1, 2, 3, 1, 2, 3 }, 2);

        System.out.println(result);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (window.contains(nums[i])) {
                return true;
            }

            window.add(nums[i]);

            if (window.size() > k) {

                window.remove(nums[i - k]);

            }

        }

        return false;
    }
}
