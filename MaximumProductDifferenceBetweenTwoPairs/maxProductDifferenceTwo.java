import java.util.Arrays;

public class maxProductDifferenceTwo {

    public static void main(String[] args) {
    
        System.out.println("Hello LeetCoder!!");
        maxProductDifferenceTwo m = new maxProductDifferenceTwo();
        int result = m.maxProductDifference(new int[]{5,6,2,7,4});
    }

    public int maxProductDifference(int[] nums) {
        int len = nums.length;
        if(len == 1) return nums[0] * nums[1];
        if(len == 0) return nums[0];
        
        Arrays.sort(nums);
        return (nums[0] * nums[1]) - (nums[len-1] * nums[len-2]);
    }

}