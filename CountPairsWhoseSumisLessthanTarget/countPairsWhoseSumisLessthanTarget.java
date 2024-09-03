//package CountPairsWhoseSumisLessthanTarget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class countPairsWhoseSumisLessthanTarget {
    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        System.out.println(countPairs(new ArrayList<>(Arrays.asList(-1, 1, 2, 3, 1)), 2));

    }

    

    public static int countPairs(List<Integer> nums, int target) {

        Collections.sort(nums);
        int count = extracted();

        for (int i = 0; i <= nums.size() -1; i++) {
            int j = binarySearch(nums, i + 1, nums.size() -1, target - nums.get(i));
            count += j - i;
        }
        return count;
    }

    private static int extracted() {
        return 0;
    }

    private static int binarySearch(List<Integer> nums, int left, int right, int target) {
        while (left <= right) {
            int mid = (right - left) / 2;
            if (nums.get(mid) < target) {
                left = mid + 1; // Buscar en la mitad derecha
            } else {
                right = mid - 1; // Buscar en la mitad izquierda
            }
        }
        return right;
    }

        /*
     * -- Brute force --
     * 
     * public static int countPairs(List<Integer> nums, int target) {
     * 
     * Collections.sort(nums);
     * int count = 0;
     * for (int i = 0; i < nums.size(); i++) {
     * for (int j = i + 1; j < nums.size(); j++) {
     * 
     * if (nums.get(i) + nums.get(j) < target) {
     * count++;
     * }
     * }
     * }
     * 
     * return count;
     * }
     */
}