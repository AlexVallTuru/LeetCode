package IncreasingTripletSubsequence;

public class increasingTripletSubsequence {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        increasingTripletSubsequence i = new increasingTripletSubsequence();
        i.increasingTriplet(new int[] { 20,100,10,12,5,13 });

    }

    public boolean increasingTriplet(int[] nums) {

        int len = nums.length;

        int maxVal1 = Integer.MAX_VALUE;
        int maxVal2 = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {

            if (maxVal1 >= nums[i]) {
                maxVal1 = nums[i];
            } else if (nums[i] <= maxVal2) {
                maxVal2 = nums[i];
            } else {
                return true;
            }

        }

        return false;
    }
}
