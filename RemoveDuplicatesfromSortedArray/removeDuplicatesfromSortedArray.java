
//package RemoveDuplicatesfromSortedArray;

public class removeDuplicatesfromSortedArray {

    public static void main(String[] args) {

        int result = removeDuplicates(new int[] { 1,2,3 });

    }

    public static int removeDuplicates(int[] nums) {

        int index = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index ;
    }

}