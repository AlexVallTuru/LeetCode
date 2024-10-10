package MaximunWidthRamp;

import java.util.Stack;

public class maximunWidthRamp {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        maximunWidthRamp m = new maximunWidthRamp();

        m.maxWidthRamp(new int[] { 9, 8, 1, 0, 1, 9, 4, 0, 4, 1 });

    }

    public int maxWidthRamp(int[] nums) {

        int len = nums.length;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
        
            if(stack.isEmpty() || nums[stack.peek()] > nums[i]){

                stack.push(i);

            }
        }

        int maxWidth = 0;

        for (int i = len -1; i >= 0; i--) {
        
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                
                maxWidth = Math.max(maxWidth, i - stack.pop());

            }
        }

        return maxWidth;

    }
}
