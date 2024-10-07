package Subsets;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    
    public static void main(String[] args) {
    
        System.out.println("Hello LeetCoder!!");
        subsets s = new subsets();

        List<List<Integer>> result = s.subsetss(new int[]{1, 2, 3});
        System.out.println(result);
    }

    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        subset(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void subset(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]); 
            result.add(new ArrayList<>(current));
            subset(nums, i + 1, current, result); 
            current.remove(current.size() - 1);  
        }
    }
}
