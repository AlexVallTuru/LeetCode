import Subsets.subsets;

public class countMaxBitwiseORSubsets{ 

    public static void main(String[] args) {
    
        System.out.println("Hello LeetCoder!!");
    
        countMaxBitwiseORSubsets c = new countMaxBitwiseORSubsets();
        int result = c.countMaxOrSubsets(new int[]{3,2,1,5});
        System.out.println(result);
    }

    public int countMaxOrSubsets(int[] nums) {
        
        int len = nums.length;

        int maximumBitwaseOR = 0;
        for (int i = 0; i < len; i++) {
        
            maximumBitwaseOR = maximumBitwaseOR | nums[i];
        
        }
        
        int result = ORSubsets(nums, 0,0, maximumBitwaseOR);

        return maximumBitwaseOR;

    }

    public int ORSubsets(int[] nums, int index, int currentOR, int maxOR) {


    }

}