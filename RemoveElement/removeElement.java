package RemoveElement;

public class removeElement {
    public static void main(String[] args) {

        int result = removeElement1(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2);

    }

    public static int removeElement1(int[] nums, int val) {

        int index = 0;

        for(int i = 0; i < nums.length; i ++) {
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
