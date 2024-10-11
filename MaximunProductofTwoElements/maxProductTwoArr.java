//package MaximunProductofTwoElements;

import java.util.Arrays;

public class maxProductTwoArr {
    
    public static void main(String[] args) {
    
        System.out.println("Hello LeetCoder!!");
    
        maxProductTwoArr m = new maxProductTwoArr();

        m.maxProduct(new int []{1,2,3,4});

    }

    public int maxProduct(int[] nums) {
        
        Arrays.sort(nums);
        
        int len = nums.length;

        if(len <= 1){
            return nums[0] -1;
        }

        return (nums[len-1]-1) * (nums[len-2]-1);

    }

}
