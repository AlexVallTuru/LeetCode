//package MinimunNumberGate;

import java.util.Arrays;


public class minimunNumberGate {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        numberGame(new int[]{2,5});
    }

    public static int[] numberGame(int[] nums) {

        int len = nums.length;
        int[] numsSorted = nums.clone();
        Arrays.sort(numsSorted);

        for (int i = 0; i < len; i++) {

            if (i % 2 == 0) {
                nums[i + 1] = numsSorted[i];
            } else {
                nums[i -1] = numsSorted[i];
            }

        }

        return nums;

    }

}
